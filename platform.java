import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.util.Hashtable;
import java.awt.Container;
import java.awt.event.ActionListener;

public class platform {
    static Integer[] cyberTalents = new Integer[]{1,3,4,1,5};
    static Integer[] facebookCTF = new Integer[]{5,5,1,5,1};
    static Integer[] hackTheBox = new Integer[]{2,4,5,2,4};
    static Integer[] ctfdHosted = new Integer[]{3,1,3,1,5};
    static Integer[] ctfdOpenSource = new Integer[]{5,1,2,4,3};
    static Integer[] rootTheBox = new Integer[]{5,3,1,3,2};

    static Integer[] cyberTalentsAdj = new Integer[5];
    static Integer[] facebookCTFAdj = new Integer[5];
    static Integer[] hackTheBoxAdj = new Integer[5];
    static Integer[] ctfdHostedAdj = new Integer[5];
    static Integer[] ctfdOpenSourceAdj = new Integer[5];
    static Integer[] rootTheBoxAdj = new Integer[5];

    static String winningPlatform = "";
    static Integer priceValue = 1;
    static Integer appearanceValue = 1;
    static Integer supportValue = 1;
    static Integer customizableValue = 1;
    static Integer deploymentValue = 1;

    static int cyberTalentsScore = 0;
    static int facebookCTFScore = 0;
    static int hackTheBoxScore = 0;
    static int ctfdHostedScore = 0;
    static int ctfdOpenSourceScore = 0;
    static int rootTheBoxScore = 0;

    static JLabel resultLabel = new JLabel("", SwingConstants.CENTER);
    static JLabel result = new JLabel("", SwingConstants.CENTER);

    private static void createGUI() {
        JFrame frame = new JFrame("Find a CTF Platform");
        JPanel sliderPanel = new JPanel();
        JPanel headerPanel = new JPanel();
        JPanel belowSliderPanel = new JPanel();
        
        Container contentPane = frame.getContentPane();
        GridLayout sliderLayout = new GridLayout(0,2);
        BorderLayout border = new BorderLayout();
        GridLayout belowSliderLayout = new GridLayout(0,1);
        sliderLayout.setVgap(15);

        resultLabel.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
        result.setFont(new Font("Helvetic Neue", Font.BOLD, 15));
        result.setFont(new Font("Helvetic Neue", Font.ROMAN_BASELINE, 14));
        contentPane.setLayout(border);
        headerPanel.setLayout(new GridLayout(2,1));
        sliderPanel.setLayout(sliderLayout);
        belowSliderPanel.setLayout(belowSliderLayout);
        belowSliderPanel.setBorder(BorderFactory.createEmptyBorder(15, 150, 15, 150));

        // Price Slider and Label

        JSlider price = new JSlider(JSlider.HORIZONTAL, 1, 5, 1);
        JLabel priceLabel = new JLabel("Low Price: ");
        priceLabel.setBorder(BorderFactory.createEmptyBorder(0,75,0,0));
        price.setMajorTickSpacing(1);
        price.setPaintTicks(true);
        
        Hashtable<Integer, JLabel> pricePosition = new Hashtable<>();
        pricePosition.put(1, new JLabel("1"));
        pricePosition.put(2, new JLabel("2"));
        pricePosition.put(3, new JLabel("3"));
        pricePosition.put(4, new JLabel("4"));
        pricePosition.put(5, new JLabel("5"));

        price.setLabelTable(pricePosition);
        price.setPaintLabels(true);
        price.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 66));

        // Appearance Slider and Label

        JSlider appearance = new JSlider(JSlider.HORIZONTAL, 1, 5, 1);
        JLabel appearanceLabel = new JLabel("Appearance: ");
        appearanceLabel.setBorder(BorderFactory.createEmptyBorder(0, 75, 0, 0));
        appearance.setMajorTickSpacing(1);
        appearance.setPaintTicks(true);

        Hashtable<Integer, JLabel> appearancePosition = new Hashtable<>();
        appearancePosition.put(1, new JLabel("1"));
        appearancePosition.put(2, new JLabel("2"));
        appearancePosition.put(3, new JLabel("3"));
        appearancePosition.put(4, new JLabel("4"));
        appearancePosition.put(5, new JLabel("5"));

        appearance.setLabelTable(appearancePosition);
        appearance.setPaintLabels(true);
        appearance.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 66));

        // Support Slider and Label

        JSlider support = new JSlider(JSlider.HORIZONTAL, 1, 5, 1);
        JLabel supportLabel = new JLabel("Support: ");
        supportLabel.setBorder(BorderFactory.createEmptyBorder(0, 75, 0, 0));
        support.setMajorTickSpacing(1);
        support.setPaintTicks(true);

        Hashtable<Integer, JLabel> supportPosition = new Hashtable<>();
        supportPosition.put(1, new JLabel("1"));
        supportPosition.put(2, new JLabel("2"));
        supportPosition.put(3, new JLabel("3"));
        supportPosition.put(4, new JLabel("4"));
        supportPosition.put(5, new JLabel("5"));

        support.setLabelTable(appearancePosition);
        support.setPaintLabels(true);
        support.setPaintTicks(true);
        support.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 66));
        
        // Customizable Slider and Label

        JSlider customizable = new JSlider(JSlider.HORIZONTAL, 1, 5, 1);
        JLabel customizableLabel = new JLabel("Customizability: ");
        customizableLabel.setBorder(BorderFactory.createEmptyBorder(0, 75, 0, 0));
        customizable.setMajorTickSpacing(1);
        customizable.setPaintTicks(true);

        Hashtable<Integer, JLabel> customizablePosition = new Hashtable<>();
        customizablePosition.put(1, new JLabel("1"));
        customizablePosition.put(2, new JLabel("2"));
        customizablePosition.put(3, new JLabel("3"));
        customizablePosition.put(4, new JLabel("4"));
        customizablePosition.put(5, new JLabel("5"));

        customizable.setLabelTable(customizablePosition);
        customizable.setPaintLabels(true);
        customizable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 66));

        // Deployment Slider and Label

        JSlider deployment = new JSlider(JSlider.HORIZONTAL, 1, 5, 1);
        JLabel deploymentLabel = new JLabel("<html><body>Ease of<br>Deployment: </body></html>");
        deploymentLabel.setBorder(BorderFactory.createEmptyBorder(0, 75, 25, 0));
        deployment.setMajorTickSpacing(1);
        deployment.setPaintTicks(true);

        Hashtable<Integer, JLabel> deploymentPosition = new Hashtable<>();
        deploymentPosition.put(1, new JLabel("1"));
        deploymentPosition.put(2, new JLabel("2"));
        deploymentPosition.put(3, new JLabel("3"));
        deploymentPosition.put(4, new JLabel("4"));
        deploymentPosition.put(5, new JLabel("5"));

        deployment.setLabelTable(deploymentPosition);
        deployment.setPaintLabels(true);
        deployment.setBorder(BorderFactory.createEmptyBorder(0, 0, 25, 66));

        JLabel header = new JLabel("<html><body><center>Find a CTF Platform</center></body></html>", SwingConstants.CENTER);
        header.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
        headerPanel.add(header);
        header.setBorder(BorderFactory.createEmptyBorder(15,0,0,0));
        
        JLabel instructions = new JLabel("<html><body><center>Rank the Importance of <br> Each Factor Below </center></body></html>", SwingConstants.CENTER);
        instructions.setFont(new Font("Helvetica Neue", Font.ROMAN_BASELINE, 14));
        instructions.setBorder(BorderFactory.createEmptyBorder(5, 0, 30, 0));
        headerPanel.add(instructions);

        sliderPanel.add(priceLabel);
        sliderPanel.add(price);
        sliderPanel.add(appearanceLabel);
        sliderPanel.add(appearance);
        sliderPanel.add(supportLabel);
        sliderPanel.add(support);
        sliderPanel.add(customizableLabel);
        sliderPanel.add(customizable);
        sliderPanel.add(deploymentLabel);
        sliderPanel.add(deployment);

        contentPane.add(headerPanel, BorderLayout.NORTH);
        contentPane.add(sliderPanel);

        frame.pack();
        frame.setSize(450, 725);
        frame.setResizable(false);
        frame.setVisible(true);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });  

        
        belowSliderPanel.add(submitButton);
        belowSliderPanel.add(resultLabel);
        belowSliderPanel.add(result);

        contentPane.add(belowSliderPanel, BorderLayout.SOUTH);

        // Change Listeners

        price.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider)e.getSource();
                if (!source.getValueIsAdjusting()) {
                    priceValue = source.getValue();
                }
            }
        });

        appearance.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider)e.getSource();
                if (!source.getValueIsAdjusting()) {
                appearanceValue = source.getValue();
                }
            }
        });

        support.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider)e.getSource();
                if (!source.getValueIsAdjusting()) {
                    supportValue = source.getValue();
                }
            }
        });

        customizable.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider)e.getSource();
                if (!source.getValueIsAdjusting()) {
                    customizableValue = source.getValue();
                }
            }
        });

        deployment.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider)e.getSource();
                if (!source.getValueIsAdjusting()) {
                    deploymentValue = source.getValue();
                }
            }
        });
    }

    public static void findCTF(Integer priceVal, Integer appearanceVal, Integer supportVal, Integer customizableVal, Integer deploymentVal) {
        
        
        cyberTalentsAdj[0] = cyberTalents[0] * priceVal;
        cyberTalentsAdj[1] = cyberTalents[1] * appearanceVal;
        cyberTalentsAdj[2] = cyberTalents[2] * supportVal;
        cyberTalentsAdj[3] = cyberTalents[3] * customizableVal;
        cyberTalentsAdj[4] = cyberTalents[4] * deploymentVal;

        for (int i = 0; i<cyberTalentsAdj.length; i++) {
            cyberTalentsScore += cyberTalentsAdj[i];
        }

        facebookCTFAdj[0] = facebookCTF[0] * priceVal;
        facebookCTFAdj[1] = facebookCTF[1] * appearanceVal;
        facebookCTFAdj[2] = facebookCTF[2] * supportVal;
        facebookCTFAdj[3] = facebookCTF[3] * customizableVal;
        facebookCTFAdj[4] = facebookCTF[4] * deploymentVal;

        for (int i = 0; i<facebookCTFAdj.length; i++) {
            facebookCTFScore += facebookCTFAdj[i];
        }

        hackTheBoxAdj[0] = hackTheBox[0] * priceVal;
        hackTheBoxAdj[1] = hackTheBox[1] * appearanceVal;
        hackTheBoxAdj[2] = hackTheBox[2] * supportVal;
        hackTheBoxAdj[3] = hackTheBox[3] * customizableVal;
        hackTheBoxAdj[4] = hackTheBox[4] * deploymentVal;

        for (int i = 0; i<hackTheBoxAdj.length; i++) {
            hackTheBoxScore += hackTheBoxAdj[i];
        }

        ctfdHostedAdj[0] = ctfdHosted[0] * priceVal;
        ctfdHostedAdj[1] = ctfdHosted[1] * appearanceVal;
        ctfdHostedAdj[2] = ctfdHosted[2] * supportVal;
        ctfdHostedAdj[3] = ctfdHosted[3] * customizableVal;
        ctfdHostedAdj[4] = ctfdHosted[4] * deploymentVal;

        for (int i = 0; i<ctfdHostedAdj.length; i++) {
            ctfdHostedScore += ctfdHostedAdj[i];
        }
        
        ctfdOpenSourceAdj[0] = ctfdOpenSource[0] * priceVal;
        ctfdOpenSourceAdj[1] = ctfdOpenSource[1] * appearanceVal;
        ctfdOpenSourceAdj[2] = ctfdOpenSource[2] * supportVal;
        ctfdOpenSourceAdj[3] = ctfdOpenSource[3] * customizableVal;
        ctfdOpenSourceAdj[4] = ctfdOpenSource[4] * deploymentVal;

        for (int i = 0; i<ctfdOpenSourceAdj.length; i++) {
            ctfdOpenSourceScore += ctfdOpenSourceAdj[i];
        }

        rootTheBoxAdj[0] = rootTheBox[0] * priceVal;
        rootTheBoxAdj[1] = rootTheBox[1] * appearanceVal;
        rootTheBoxAdj[2] = rootTheBox[2] * supportVal;
        rootTheBoxAdj[3] = rootTheBox[3] * customizableVal;
        rootTheBoxAdj[4] = rootTheBox[4] * deploymentVal;

        for (int i = 0; i<rootTheBoxAdj.length; i++) {
            rootTheBoxScore += rootTheBoxAdj[i];
        }

        if (cyberTalentsScore > facebookCTFScore){
            if (cyberTalentsScore > hackTheBoxScore){
                if (cyberTalentsScore > ctfdHostedScore){
                    if (cyberTalentsScore > ctfdOpenSourceScore){
                        if (cyberTalentsScore > rootTheBoxScore){
                            winningPlatform = "Cyber Talents";
                        }
                    }
                }
            }
        }

        if (facebookCTFScore > cyberTalentsScore){
            if (facebookCTFScore > hackTheBoxScore){
                if (facebookCTFScore > ctfdHostedScore){
                    if (facebookCTFScore > ctfdOpenSourceScore){
                        if (facebookCTFScore > rootTheBoxScore){
                            winningPlatform = "Facebook CTF";
                        }
                    }
                }
            }
        }

        if (hackTheBoxScore > facebookCTFScore) {
            if (hackTheBoxScore > cyberTalentsScore){
                if (hackTheBoxScore > ctfdHostedScore){
                    if (hackTheBoxScore > ctfdOpenSourceScore){
                        if (hackTheBoxScore > rootTheBoxScore){
                            winningPlatform = "Hack the Box";
                        }
                    }
                }
            }
        }

        if (ctfdHostedScore > facebookCTFScore){
            if (ctfdHostedScore > hackTheBoxScore){
                if (ctfdHostedScore > cyberTalentsScore){
                    if (ctfdHostedScore > ctfdOpenSourceScore){
                        if (ctfdHostedScore > rootTheBoxScore){
                            winningPlatform = "CTFd Hosted";
                        }
                    }
                }
            }
        }

        if (ctfdOpenSourceScore > facebookCTFScore){
            if (ctfdOpenSourceScore > hackTheBoxScore){
                if (ctfdOpenSourceScore > ctfdHostedScore){
                    if (ctfdOpenSourceScore > cyberTalentsScore){
                        if (ctfdOpenSourceScore > rootTheBoxScore){
                            winningPlatform = "CTFd Open Source";
                        }
                    }
                }
            }
        }

        if (rootTheBoxScore > facebookCTFScore){
            if (rootTheBoxScore > hackTheBoxScore){
                if (rootTheBoxScore > ctfdHostedScore){
                    if (rootTheBoxScore > ctfdOpenSourceScore){
                        if (rootTheBoxScore > cyberTalentsScore){
                            winningPlatform = "Root the Box";
                        }
                    }
                }
            }
        }
    }

    private static void buttonActionPerformed(ActionEvent evt) {
        cyberTalentsScore = 0;
        facebookCTFScore = 0;
        hackTheBoxScore = 0;
        ctfdHostedScore = 0;
        ctfdOpenSourceScore = 0;
        rootTheBoxScore = 0;

        findCTF(priceValue, appearanceValue, supportValue, customizableValue, deploymentValue);
        resultLabel.setText("<html><body><center>Recommendation: </center></body></html>" + winningPlatform);
        result.setText(winningPlatform);
        // System.out.println(cyberTalentsScore);
        // System.out.println(facebookCTFScore);
        // System.out.println(hackTheBoxScore);
        // System.out.println(ctfdHostedScore);
        // System.out.println(ctfdOpenSourceScore);
        // System.out.println(rootTheBoxScore);
    }
    
    public static void main(String[] args){
        // createGUI();
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
}