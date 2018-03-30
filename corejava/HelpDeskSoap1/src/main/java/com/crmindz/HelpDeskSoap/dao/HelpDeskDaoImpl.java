package com.crmindz.HelpDeskSoap.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.crmindz.HelpDeskSoap.domain.LoginCredentails;
import com.crmindz.HelpDeskSoap.domain.Registration;
import com.crmindz.HelpDeskSoap.domain.TicketCreation;



/**
 * @author Puneeth DAOImpl class implements the methods in DAO interface to
 *         save, retrieve the user data from interface and also some reference
 *         data for application is retrieved
 */
@Repository
public class HelpDeskDaoImpl implements HelpDeskDao {

	@Autowired
	DataSource datasource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * register method is used to save the details of the user in database.
	 */
	public void register(Registration register) {

		SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
		insert.setGeneratedKeyName("id");

		Map<String, Object> data = new HashMap<String, Object>();
		data.put("firstName", register.getFirstName());
		data.put("lastName", register.getLastName());
		data.put("email", register.getEmail());
		data.put("phnNo", register.getPhnNo());

		List<String> columns = new ArrayList<String>();
		columns.add("firstName");
		columns.add("lastName");
		columns.add("email");
		columns.add("phnNo");

		insert.setTableName("User");
		insert.setColumnNames(columns);
		Number key = insert.executeAndReturnKey(data);

		System.out.println(key);

		String query1 = "insert into UserDetails (username, password, usertype, Id) values (?,?,?,?)";
		Object[] args1 = new Object[] { register.getLogin().getUsername(), register.getLogin().getPassword(),
				register.getLogin().getUsertype(), key };
		jdbcTemplate.update(query1, args1);

		String query2 = "insert into Address (addressline1, addressline2, city, state, zipCode, Id) values (?,?,?,?,?,?) ";
		Object[] args2 = new Object[] { register.getAddress().getAddressLine1(),
				register.getAddress().getAddressLine2(), register.getAddress().getCity(),
				register.getAddress().getState(), register.getAddress().getZipCode(), key };
		jdbcTemplate.update(query2, args2);
	}

	/**
	 * getLoginDetails method returns the login details from database based on
	 * username.
	 */
	public List<LoginCredentails> getLoginDetails(LoginCredentails login) {
		String username = login.getUsername();
		String query3 = "select * from UserDetails where username=?";
		List<LoginCredentails> lc = jdbcTemplate.query(query3, new Object[] { username },
				new RowMapper<LoginCredentails>() {

					public LoginCredentails mapRow(ResultSet rs, int rowNum) throws SQLException {
						LoginCredentails lc1 = new LoginCredentails();
						lc1.setUsername(rs.getString("username"));
						lc1.setPassword(rs.getString("password"));
						lc1.setUsertype(rs.getString("usertype"));
						return lc1;

					}

				});
		return lc;

	}

	/**
	 * getStates returns the list of maps that contains the state name and code.
	 */
	public List<Map<String, String>> getStates() {
		String state = "select name,code from state";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(state);
		List<Map<String, String>> states = new ArrayList<Map<String, String>>();

		for (Map<String, Object> row : list) {
			Map<String, String> state1 = new HashMap<String, String>();
			state1.put("code", (String) row.get("code"));
			state1.put("name", (String) row.get("name"));
			states.add(state1);

		}
		return states;
	}

	/**
	 * getUsertype method returns the list of maps that contains usertype info.
	 */
	public List<Map<String, String>> getUsertype() {
		String usertype = "select type,value from usertype ";
		List<Map<String, Object>> userlist = jdbcTemplate.queryForList(usertype);
		List<Map<String, String>> usertype1 = new ArrayList<Map<String, String>>();

		for (Map<String, Object> type : userlist) {
			Map<String, String> user = new HashMap<String, String>();
			user.put("type", (String) type.get("type"));
			user.put("value", (String) type.get("value"));
			usertype1.add(user);
		}
		return usertype1;

	}

	/**
	 * getCategory method returns the list of maps which contains the ticket
	 * category.
	 */
	public List<Map<String, String>> getCategory() {
		String category = "select category from Category";
		List<Map<String, Object>> categorylist = jdbcTemplate.queryForList(category);
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();

		for (Map<String, Object> Category : categorylist) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("category", (String) Category.get("category"));
			list.add(map);
		}
		return list;

	}

	/**
	 * getSubCategory method returns the list of maps which contains the ticket sub
	 * category.
	 */
	public List<Map<String, String>> getSubCategory(String subcategory) {
		String query6 = "select cid from Category where category=?";
		int id = jdbcTemplate.queryForObject(query6, new Object[] { subcategory }, Integer.class);
		String query7 = "select * from SubCategory where cid=?";
		Object[] args3 = new Object[] { id };
		List<Map<String, Object>> list3 = jdbcTemplate.queryForList(query7, args3);
		List<Map<String, String>> subcategorylist = new ArrayList<Map<String, String>>();

		for (Map<String, Object> SubCategory : list3) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("query7", (String) SubCategory.get("subcategory"));
			subcategorylist.add(map);
		}
		return subcategorylist;
	}

	/**
	 * createTicket method saves the ticket info based on the username.
	 */
	public void createTicket(TicketCreation Ticket, String username) {

		String query10 = "select userId from UserDetails where username=? ";
		Object[] args11 = new Object[] { username };
		int id = jdbcTemplate.queryForObject(query10, args11, Integer.class);
		System.out.println(id);
		String query8 = "insert into ticket(ticketreferenceno,Category,SubCategory,subject,Description,Status,comments,userId) values (?,?,?,?,?,?,?,?)";
		Object[] args7 = new Object[] { Ticket.getTicketreferenceno(), Ticket.getCategory(), Ticket.getSubCategory(),
				Ticket.getSubject(), Ticket.getDescription(), Ticket.getStatus(), Ticket.getComments(), id };
		jdbcTemplate.update(query8, args7);
	}

	/**
	 * getGrid method returns the list of tickets based on the username.
	 */
	public List<TicketCreation> getGrid(String username) {
		String query10 = "select userId from UserDetails where username=? ";
		Object[] args11 = new Object[] { username };
		int id = jdbcTemplate.queryForObject(query10, args11, Integer.class);
		String query3 = "select * from ticket where userId=?";
		Object[] args12 = new Object[] { id };
		List<TicketCreation> lc = jdbcTemplate.query(query3, args12, new RowMapper<TicketCreation>() {

			public TicketCreation mapRow(ResultSet rs, int rowNum) throws SQLException {
				TicketCreation tc = new TicketCreation();
				tc.setTicketreferenceno(rs.getInt("ticketreferenceno"));
				tc.setCategory(rs.getString("Category"));
				tc.setSubCategory(rs.getString("SubCategory"));
				tc.setSubject(rs.getString("subject"));
				tc.setDescription(rs.getString("Description"));
				tc.setStatus(rs.getString("Status"));
				tc.setComments(rs.getString("comments"));
				return tc;

			}

		});
		return lc;

	}

	/**
	 * getEmpGrid method returns the list of pending tickets.
	 */
	public List<TicketCreation> getEmpGrid() {
		String pending = "Pending";
		String query15 = "select * from ticket where Status=?";
		Object[] args17 = new Object[] { pending };
		List<TicketCreation> lc = jdbcTemplate.query(query15, args17, new RowMapper<TicketCreation>() {

			public TicketCreation mapRow(ResultSet rs, int rowNum) throws SQLException {
				TicketCreation tc = new TicketCreation();
				tc.setTicketId(rs.getInt("ticketid"));
				tc.setTicketreferenceno(rs.getInt("ticketreferenceno"));
				tc.setCategory(rs.getString("Category"));
				tc.setSubCategory(rs.getString("SubCategory"));
				tc.setSubject(rs.getString("subject"));
				tc.setDescription(rs.getString("Description"));
				tc.setStatus(rs.getString("Status"));
				tc.setComments(rs.getString("comments"));
				return tc;
			}

		});
		return lc;
	}

	/**
	 * getApprovalEmpGrid method updates the ticket table with approved status and
	 * comments and return the approved tickets.
	 */
	public List<TicketCreation> getApprovalEmpGrid() {
		String approved = "Approved";
		String query15 = "select * from ticket where Status=?";
		Object[] args17 = new Object[] { approved };
		List<TicketCreation> lc = jdbcTemplate.query(query15, args17, new RowMapper<TicketCreation>() {

			public TicketCreation mapRow(ResultSet rs, int rowNum) throws SQLException {
				TicketCreation tc = new TicketCreation();
				tc.setTicketreferenceno(rs.getInt("ticketreferenceno"));
				tc.setCategory(rs.getString("Category"));
				tc.setSubCategory(rs.getString("SubCategory"));
				tc.setSubject(rs.getString("subject"));
				tc.setDescription(rs.getString("Description"));
				tc.setStatus(rs.getString("Status"));
				tc.setComments(rs.getString("comments"));
				return tc;
			}

		});
		return lc;
	}

	/**
	 * getRejectEmpGrid method updates the ticket table in database with rejected
	 * status and returns all the rejected tickets.
	 */
	public List<TicketCreation> getRejectEmpGrid() {
		String rejected = "Rejected";
		String query15 = "select * from ticket where Status=?";
		Object[] args17 = new Object[] { rejected };
		List<TicketCreation> lc = jdbcTemplate.query(query15, args17, new RowMapper<TicketCreation>() {

			public TicketCreation mapRow(ResultSet rs, int rowNum) throws SQLException {
				TicketCreation tc = new TicketCreation();
				tc.setTicketreferenceno(rs.getInt("ticketreferenceno"));
				tc.setCategory(rs.getString("Category"));
				tc.setSubCategory(rs.getString("SubCategory"));
				tc.setSubject(rs.getString("subject"));
				tc.setDescription(rs.getString("Description"));
				tc.setStatus(rs.getString("Status"));
				tc.setComments(rs.getString("comments"));
				return tc;
			}

		});
		return lc;
	}

	/**
	 * updateGrid method returns the list of all approved tickets.
	 */
	public void updateGrid(String ticketref, String comments) {
		String approved = "Approved";
		String query25 = "update ticket set Status=? where ticketreferenceno=?";
		jdbcTemplate.update(query25, approved, ticketref);
		String query27 = "update ticket set comments=? where ticketreferenceno=?";
		jdbcTemplate.update(query27, comments, ticketref);
	}

	/**
	 * updateRejectGrid returns list of all rejected tickets.
	 */
	public void updateRejectGrid(String ticketref, String comments) {
		String rejected = "Rejected";
		String query25 = "update ticket set Status=? where ticketreferenceno=?";
		jdbcTemplate.update(query25, rejected, ticketref);
		String query27 = "update ticket set comments=? where ticketreferenceno=?";
		jdbcTemplate.update(query27, comments, ticketref);
	}
}
