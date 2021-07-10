import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class tree {
    JFrame f;
    tree(){
        f=new JFrame();
        DefaultMutableTreeNode style=new DefaultMutableTreeNode("Emp");
        DefaultMutableTreeNode color=new DefaultMutableTreeNode("name");
        style.add(color);
        DefaultMutableTreeNode red=new DefaultMutableTreeNode("Subeesh");
        DefaultMutableTreeNode blue=new DefaultMutableTreeNode("Mahez");
        DefaultMutableTreeNode black=new DefaultMutableTreeNode("Amal");
        DefaultMutableTreeNode green=new DefaultMutableTreeNode("Guna");
        color.add(red); color.add(blue); color.add(black); color.add(green);
        JTree jt=new JTree(style);
        f.add(jt);
        f.setSize(200,200);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new tree();
    }}