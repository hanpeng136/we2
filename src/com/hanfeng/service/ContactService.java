package com.hanfeng.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.hanfeng.beans.DBManager;
import com.hanfeng.entity.Contact;

public class ContactService {
	//��ȡȫ����ϵ����Ϣ
	public ArrayList<Contact> queryAllContacts() {
		ArrayList<Contact> contact = new ArrayList<Contact>();
		Connection conn = null;
		Statement st = null;
		PreparedStatement prst = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConn();
			String sql = "select * from contact";
			PreparedStatement ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Contact myContact = new Contact(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDouble(7),rs.getString(8),rs.getString(9));
				contact.add(myContact);		
			}
			ps.close();
			conn.close();// �ر�Connection���ͷ���Դ
			rs.close();
			System.out.println("�ɹ���ȡContact");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return contact;
	}
	//������ϵ��
	public ArrayList<Contact> queryContactById(String contact_stuID){
		ArrayList<Contact> contact = new ArrayList<Contact>();
		Connection conn = null;
		Statement st = null;
		PreparedStatement prst = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConn();
			String sql = "select * from contact where contact_stuID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,contact_stuID);
			rs = ps.executeQuery();
			if(rs.next()) {
				Contact myContact = new Contact(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDouble(7),rs.getString(8),rs.getString(9));
				contact.add(myContact);
				System.out.println("���ҳɹ�");
			}else{
				contact = null;
			}
			ps.close();
			conn.close();// �ر�Connection���ͷ���Դ
			rs.close();
			System.out.println("�ɹ���ȡContact");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return contact;
	}
	//�޸���ϵ����Ϣ
	public void updateContact(Contact c){
		Connection conn = null;
		Statement st = null;
		PreparedStatement prst = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getConn();
			String sql = "update contact set contact_name=?,contact_class=?,contact_stuID=?,contact_age=?,contact_birthday=?,contact_weight=?,contact_phone=?,contact_remarks=? where contact_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			// ��SQL����еĵ�1��������ֵ
			ps.setString(1,c.getContact_name() );
			// ��SQL����еĵ�2��������ֵ
			ps.setString(2,c.getContact_class());
			ps.setString(3,c.getContact_stuID());
			ps.setInt(4,c.getContact_age() );
			ps.setString(5,c.getContact_birthday());
			ps.setDouble(6,c.getContact_weight());
			ps.setString(7, c.getContact_phone());
			ps.setString(8,c.getContact_remarks());
			ps.setInt(9,c.getContact_id());
			ps.executeUpdate();
			ps.close();
			// �ر�Connection���ͷ���Դ
			conn.close();
			System.out.println("�޸ĳɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//�����ϵ��
	public void insertContact(Contact c){
		Connection conn = null;
		Statement st = null;
		PreparedStatement prst = null;
		ResultSet rs = null;
		boolean data = false;
		try {
			conn = DBManager.getConn();
			String sql = "insert into contact(contact_name,contact_class,contact_stuID,contact_age,contact_birthday,contact_weight,contact_phone,contact_remarks) values(?,?,?,?,?,?,?,?)";
			// ��ȡPreparedStatement
			PreparedStatement ps = conn.prepareStatement(sql);
			// ��SQL����еĵ�1��������ֵ
			ps.setString(1,c.getContact_name() );
			// ��SQL����еĵ�2��������ֵ
			ps.setString(2,c.getContact_class() );
			// ��SQL����еĵ�3��������ֵ
			ps.setString(3,c.getContact_stuID() );
			ps.setInt(4, c.getContact_age());
			// ��SQL����еĵ�4��������ֵ
			ps.setString(5, c.getContact_birthday());
			// ��SQL����еĵ�5��������ֵ
			ps.setDouble(6,c.getContact_weight() );
			ps.setString(7,c.getContact_phone() );
			ps.setString(8, c.getContact_remarks());

			int row = ps.executeUpdate();
			ps.close();
			conn.close();
			System.out.println("��ϵ����ӳɹ�");
		} catch (Exception e) {
		System.out.println("��ϵ�����ʧ��");
			e.printStackTrace();
		}
	
	}
	//ɾ����ϵ��
	public void deleteContactById(int contact_id){
		Connection conn = null;
		Statement st = null;
		PreparedStatement prst = null;
		ResultSet rs = null;

		String sql = "delete from contact where contact_id =?";
		try {
			conn = DBManager.getConn();
			System.out.println(sql);
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,contact_id );
			ps.executeUpdate();
			conn.close();// �ر�Connection���ͷ���Դ
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
