
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
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author KIIT
 */
public class deleteproduct extends javax.swing.JFrame {

	/**
	 * Creates new form deleteproduct
	 */
	public deleteproduct() {
		initComponents();
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
                jSeparator1 = new javax.swing.JSeparator();
                jLabel3 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jSeparator2 = new javax.swing.JSeparator();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jTextField2 = new javax.swing.JTextField();
                jTextField3 = new javax.swing.JTextField();
                jTextField5 = new javax.swing.JTextField();
                jTextField4 = new javax.swing.JTextField();
                jSeparator3 = new javax.swing.JSeparator();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jLabel8 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setLocation(new java.awt.Point(350, 160));
                setMinimumSize(new java.awt.Dimension(600, 450));
                setUndecorated(true);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/delete product ani.gif"))); // NOI18N
                getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 1, -1, -1));

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/delete product.png"))); // NOI18N
                getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 1, -1, -1));
                getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 68, 588, 10));

                jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel3.setText("Product Id:");
                getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 89, -1, -1));

                jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 86, 138, -1));

                jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/search.png"))); // NOI18N
                jButton1.setText("Search");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 84, -1, -1));
                getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 117, 588, 10));

                jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel4.setText("Product Name:");
                getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 136, -1, -1));

                jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel5.setText("Rate:");
                getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 177, -1, -1));

                jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel6.setText("Description:");
                getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 223, -1, -1));

                jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel7.setText("Activate:");
                getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 264, -1, -1));

                jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 133, 195, -1));

                jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 174, 195, -1));

                jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 261, 195, -1));

                jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 220, 195, -1));
                getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 600, 10));

                jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/delete.png"))); // NOI18N
                jButton2.setText("Delete");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 337, -1, -1));

                jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/close Jframe.png"))); // NOI18N
                jButton3.setText("Close");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 337, -1, -1));

                jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bms/all page background image.png"))); // NOI18N
                getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                // TODO add your handling code here:
		setVisible(false);
        }//GEN-LAST:event_jButton3ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
		int check=0;
		String id=jTextField1.getText();
		String query="select * from product where Id='"+id+"' ";
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql6","root","i1love2my3brother@");
			PreparedStatement pst = con.prepareStatement(query);
			java.sql.ResultSet rs=pst.executeQuery(query);
			while (rs.next())
			{
				check=1;	
			jTextField2.setText(rs.getString(2));
			jTextField3.setText(rs.getString(3));
			jTextField5.setText(rs.getString(5));
			jTextField4.setText(rs.getString(4));
			jTextField1.setEditable(false);
			}
			if (check==0)
			{
				JFrame jf=new JFrame();
				jf.setAlwaysOnTop(true);
				JOptionPane.showMessageDialog(jf,"Doesn't exist");
				
			}
		}
		catch(Exception e)
		{
		JFrame jf=new JFrame();
				jf.setAlwaysOnTop(true);
				JOptionPane.showMessageDialog(jf,e);		
		}
        }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                // TODO add your handling code here:
		String id=jTextField1.getText();
		String query="delete  from product where Id='"+id+"'";
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql6","root","i1love2my3brother@");
		PreparedStatement pst = con.prepareStatement(query);
		pst.executeUpdate();
		JFrame jf=new JFrame();
		jf.setAlwaysOnTop(true);
		JOptionPane.showMessageDialog(jf,"Successfully deleted");
		setVisible(false);
		new deleteproduct().setVisible(true);
			
		}catch(Exception e)
		{
		JFrame jf=new JFrame();
		jf.setAlwaysOnTop(true);
		JOptionPane.showMessageDialog(jf,e);		
		}
        }//GEN-LAST:event_jButton2ActionPerformed

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
			java.util.logging.Logger.getLogger(deleteproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(deleteproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(deleteproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(deleteproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new deleteproduct().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        private javax.swing.JSeparator jSeparator3;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JTextField jTextField5;
        // End of variables declaration//GEN-END:variables
}
