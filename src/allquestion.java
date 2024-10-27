
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
//import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author KIIT
 */
public class allquestion extends javax.swing.JFrame {

	/**
	 * Creates new form allquestion
	 */
	public Connection con;
	public allquestion() {
		initComponents();
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql6","root","i1love2my3brother@");
		String query="select * from question";
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.ResultSet rs=pst.executeQuery();
		//jTable1.setModel(DbUtils.resultSetToTableModel(rs));
		ResultSetMetaData ramd=rs.getMetaData();
		int n=ramd.getColumnCount();
		DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
		dtm.setRowCount(0);
		while(rs.next())
		{
			Vector v=new Vector();
			for (int i=1;i<=n;i++)
			{
				v.add(rs.getString("id"));
				v.add(rs.getString("Name"));
				v.add(rs.getString("Option_1"));
				v.add(rs.getString("Option_2"));
				v.add(rs.getString("Option_3"));
				v.add(rs.getString("Option_4"));
				v.add(rs.getString("Answer"));
			}
			//System.out.println(v);
			dtm.addRow(v);
			
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 183));
        setMinimumSize(new java.awt.Dimension(1066, 535));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1066, 535));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz/all questions.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 40)); // NOI18N
        jLabel2.setText("ALL QUESTION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 6, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz/Close.png"))); // NOI18N
        jButton1.setText(" ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1079, 94, 1, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Question", "Option_1", "Option_2", "Option_3", "Option_4", "Answer"
            }
        ));
        jTable1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jTable1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1061, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quiz/pages background admin.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
		/*JFrame jf=new JFrame();
		jf.setAlwaysOnTop(true);
			int a=JOptionPane.showConfirmDialog(null,"Do you really want to Exit application","select ",JOptionPane.YES_NO_OPTION);
			if (a==0)
		{
			setVisible(false);
			loginadmin la=new loginadmin();
			la.setVisible(true);
		}*/
		adminhome.open=0;
		setVisible(false);
        }//GEN-LAST:event_jButton1ActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(allquestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(allquestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(allquestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(allquestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new allquestion().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

	private void Statement(String query) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
}
