package gui;

import login.TelaCadastroD2;
import login.TelaLoginD2;

public class StyleInterface {
	
	public StyleInterface() {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(MostraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(TelaLoginD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(TelaCadastroD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(MostraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(TelaLoginD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(TelaCadastroD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(MostraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(TelaLoginD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(TelaCadastroD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(MostraInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(TelaLoginD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            java.util.logging.Logger.getLogger(TelaCadastroD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
	}
}


