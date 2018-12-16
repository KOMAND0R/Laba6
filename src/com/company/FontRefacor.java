package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FontRefacor extends JFrame
{

    private JTextArea textArea;
    private JButton timesNewRoman;
    private JButton msSansSerif;
    private JButton courierNew;
    private JButton blueFont;
    private JButton redFont;
    private JButton blackFont;
    private Font font;

    public static void main(String[] args)
    {
        FontRefacor app = new FontRefacor();
        app.setVisible(true);
        app.pack(); /* Эта команда подбирает оптимальный размер в зависимости от содержимого окна  */
    }

    public FontRefacor()
    {
        super("Font refactor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        timesNewRoman = new JButton("Times New Roman");
        msSansSerif = new JButton("MS Sans Cherif");
        courierNew = new JButton("Courier New");
        blueFont = new JButton("Blue Font");
        redFont = new JButton("Red Font");
        blackFont = new JButton("Black Font");


        JPanel buttonsPanel = new JPanel(new FlowLayout());
        buttonsPanel.add(timesNewRoman);
        buttonsPanel.add(msSansSerif);
        buttonsPanel.add(courierNew);
        buttonsPanel.add(blueFont);
        buttonsPanel.add(redFont);
        buttonsPanel.add(blackFont);

        textArea = new JTextArea();
        add(textArea, BorderLayout.NORTH);

        add(buttonsPanel, BorderLayout.SOUTH);
        initListeners();
    }

    private void initListeners()
    {
        timesNewRoman.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                font = new Font("Times New Roman", Font.PLAIN, 14);
                textArea.setFont(font);
            }
        });
        msSansSerif.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                font = new Font("MS Sans Serif", Font.PLAIN, 14);
                textArea.setFont(font);
            }
        });
        courierNew.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                font = new Font("Courier New", Font.PLAIN, 14);
                textArea.setFont(font);
            }
        });
        blueFont.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                textArea.setForeground(Color.BLUE);
            }
        });
        redFont.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                textArea.setForeground(Color.RED);
            }
        });
        blackFont.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                textArea.setForeground(Color.BLACK);
            }
        });
    }
}
