package com.soft1841.swing;


import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class JFileChooserTest extends JFrame implements ActionListener {
    private JButton chooseBut;
    private JLabel pathLabel;
    private JFileChooser fileChooser;


    public JFileChooserTest() {
        init();
        setTitle("JFileChooserTest");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init() {
        chooseBut = new JButton("选择文件");
        pathLabel = new JLabel("暂无选择");
        add(chooseBut, BorderLayout.NORTH);
        Font font = new Font("微软雅黑", Font.BOLD, 26);
        pathLabel.setFont(font);
        add(pathLabel);
    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.frameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new JFileChooserTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("click");
        //创建JFileChooser对象
        if (e.getSource() == chooseBut) {
            fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("F:\\JavaStudy"));
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
//            try {
//                InputStream inputStream = new FileInputStream(file);
//            }
            }
        }
    }
}
