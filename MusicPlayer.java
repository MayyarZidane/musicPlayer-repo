/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musicplayer;

import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.sound.sampled.FloatControl;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.player.Player;
import javax.sound.sampled.FloatControl;

/**
 *
 * @author mear
 */
public class MusicPlayer extends javax.swing.JFrame {

    File[] songFiles;
    int filesCounter = 0;
    FileInputStream fileInput;
    String songName, songPath;
    int songLength, songPauseLength = 0;
    boolean repeat = false, isStarted = false;
    Thread playThread;

    /**
     * Creates new form MusicPlayer
     */
    public MusicPlayer() throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        framePanel = new javax.swing.JPanel();
        ButtonPanel = new javax.swing.JPanel();
        repeatLabel = new javax.swing.JLabel();
        forbackLabel = new javax.swing.JLabel();
        playLabel = new javax.swing.JLabel();
        forwardLabel = new javax.swing.JLabel();
        openFileLabel = new javax.swing.JLabel();
        audioRunLabel = new javax.swing.JLabel();
        upSoundLabel = new javax.swing.JLabel();
        muteSoundLabel = new javax.swing.JLabel();
        downSoundLabel = new javax.swing.JLabel();
        songNamePanel = new javax.swing.JPanel();
        songIconLabel = new javax.swing.JLabel();
        songIconLabel2 = new javax.swing.JLabel();
        songNameLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        nameAppLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        settingsLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(249, 203, 118));
        setMinimumSize(new java.awt.Dimension(666, 255));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(300, 300));

        framePanel.setBackground(new java.awt.Color(249, 203, 118));
        framePanel.setPreferredSize(new java.awt.Dimension(666, 255));
        framePanel.setRequestFocusEnabled(false);

        ButtonPanel.setBackground(new java.awt.Color(249, 203, 118));

        repeatLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        repeatLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/icons/repeatSmall.png"))); // NOI18N
        repeatLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repeatLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                repeatLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                repeatLabelMouseExited(evt);
            }
        });

        forbackLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forbackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/icons/forBackSmall.png"))); // NOI18N
        forbackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forbackLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forbackLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forbackLabelMouseExited(evt);
            }
        });

        playLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/icons/playSmall.png"))); // NOI18N
        playLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playLabelMouseExited(evt);
            }
        });

        forwardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forwardLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/icons/forwardSmall.png"))); // NOI18N
        forwardLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forwardLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forwardLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forwardLabelMouseExited(evt);
            }
        });

        openFileLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        openFileLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/icons/openFloderSmall.png"))); // NOI18N
        openFileLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openFileLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                openFileLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                openFileLabelMouseExited(evt);
            }
        });

        audioRunLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        audioRunLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/icons/audioRunSmall.png"))); // NOI18N
        audioRunLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                audioRunLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                audioRunLabelMouseExited(evt);
            }
        });

        upSoundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upSoundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/icons/upSoundSmall.png"))); // NOI18N
        upSoundLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        upSoundLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                upSoundLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                upSoundLabelMouseExited(evt);
            }
        });

        muteSoundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        muteSoundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/icons/muteSoundSmall.png"))); // NOI18N
        muteSoundLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                muteSoundLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                muteSoundLabelMouseExited(evt);
            }
        });

        downSoundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        downSoundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/icons/downSoundSmall.png"))); // NOI18N
        downSoundLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                downSoundLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                downSoundLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addComponent(repeatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forbackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forwardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openFileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upSoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(downSoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(audioRunLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(muteSoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(openFileLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(forwardLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(playLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(forbackLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(repeatLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(muteSoundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(audioRunLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(upSoundLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(downSoundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        songNamePanel.setBackground(new java.awt.Color(247, 181, 59));

        songIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/icons/audioRunningSmall.png"))); // NOI18N

        songIconLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/icons/audioRunningSmall.png"))); // NOI18N

        songNameLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        songNameLabel.setForeground(new java.awt.Color(253, 233, 196));
        songNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songNameLabel.setText("SongName");
        songNameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 203, 118), 3));

        javax.swing.GroupLayout songNamePanelLayout = new javax.swing.GroupLayout(songNamePanel);
        songNamePanel.setLayout(songNamePanelLayout);
        songNamePanelLayout.setHorizontalGroup(
            songNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, songNamePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(songIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(songNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(songIconLabel2)
                .addGap(60, 60, 60))
        );
        songNamePanelLayout.setVerticalGroup(
            songNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(songIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(songIconLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, songNamePanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(songNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel4.setBackground(new java.awt.Color(253, 233, 196));

        nameAppLabel.setFont(new java.awt.Font("Simplified Arabic Fixed", 3, 36)); // NOI18N
        nameAppLabel.setForeground(new java.awt.Color(255, 165, 0));
        nameAppLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameAppLabel.setText(" Music Player");

        jPanel5.setBackground(new java.awt.Color(253, 233, 196));

        settingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/icons/settingsSmall.png"))); // NOI18N
        settingsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsLabelMouseExited(evt);
            }
        });

        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayer/icons/exitSmall.png"))); // NOI18N
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(settingsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(settingsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(nameAppLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameAppLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout framePanelLayout = new javax.swing.GroupLayout(framePanel);
        framePanel.setLayout(framePanelLayout);
        framePanelLayout.setHorizontalGroup(
            framePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(songNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        framePanelLayout.setVerticalGroup(
            framePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, framePanelLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(songNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(framePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(framePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void audioRunLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_audioRunLabelMouseEntered
        audioRunLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/audioRunBig.png")));
    }//GEN-LAST:event_audioRunLabelMouseEntered

    private void audioRunLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_audioRunLabelMouseExited
        audioRunLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/audioRunSmall.png")));
    }//GEN-LAST:event_audioRunLabelMouseExited

    private void muteSoundLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muteSoundLabelMouseEntered
        muteSoundLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/muteSoundBig.png")));
    }//GEN-LAST:event_muteSoundLabelMouseEntered

    private void muteSoundLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muteSoundLabelMouseExited
        muteSoundLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/muteSoundSmall.png")));
    }//GEN-LAST:event_muteSoundLabelMouseExited

    private void upSoundLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upSoundLabelMouseEntered
        upSoundLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/upSoundBig.png")));
    }//GEN-LAST:event_upSoundLabelMouseEntered

    private void upSoundLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upSoundLabelMouseExited
        upSoundLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/upSoundSmall.png")));
    }//GEN-LAST:event_upSoundLabelMouseExited

    private void downSoundLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downSoundLabelMouseEntered
        downSoundLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/downSoundBig.png")));
    }//GEN-LAST:event_downSoundLabelMouseEntered

    private void downSoundLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downSoundLabelMouseExited
        downSoundLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/downSoundSmall.png")));
    }//GEN-LAST:event_downSoundLabelMouseExited

    private void openFileLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openFileLabelMouseEntered
        openFileLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/OpenFolderBig.png")));
    }//GEN-LAST:event_openFileLabelMouseEntered

    private void openFileLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openFileLabelMouseExited
        openFileLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/openFloderSmall.png")));
    }//GEN-LAST:event_openFileLabelMouseExited

    private void forwardLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forwardLabelMouseEntered
        forwardLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/forwardBig.png")));
    }//GEN-LAST:event_forwardLabelMouseEntered

    private void forwardLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forwardLabelMouseExited
        forwardLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/forwardSmall.png")));
    }//GEN-LAST:event_forwardLabelMouseExited

    private void playLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playLabelMouseEntered
        if (!isStarted) {
            playLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/playBig.png")));
        } else if (isStarted) {
            playLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/pauseBig.png")));
        }
    }//GEN-LAST:event_playLabelMouseEntered

    private void playLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playLabelMouseExited
        if (!isStarted) {
            playLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/playSmall.png")));
        } else {
            playLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/pauseSmall.png")));
        }
    }//GEN-LAST:event_playLabelMouseExited

    private void forbackLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forbackLabelMouseEntered
        forbackLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/forbackBig.png")));
    }//GEN-LAST:event_forbackLabelMouseEntered

    private void forbackLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forbackLabelMouseExited
        forbackLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/forbackSmall.png")));
    }//GEN-LAST:event_forbackLabelMouseExited

    private void repeatLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repeatLabelMouseEntered
        repeatLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/repeatBig.png")));
    }//GEN-LAST:event_repeatLabelMouseEntered

    private void repeatLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repeatLabelMouseExited

        if (!repeat) {
            repeatLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/repeatSmall.png")));
        }
    }//GEN-LAST:event_repeatLabelMouseExited

    private void exitLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseEntered
        exitLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/exitBig.png")));
    }//GEN-LAST:event_exitLabelMouseEntered

    private void exitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseExited
        exitLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/exitSmall.png")));
    }//GEN-LAST:event_exitLabelMouseExited

    private void settingsLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsLabelMouseEntered
        settingsLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/settingsBig.png")));
    }//GEN-LAST:event_settingsLabelMouseEntered

    private void settingsLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsLabelMouseExited
        settingsLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/settingsSmall.png")));
    }//GEN-LAST:event_settingsLabelMouseExited

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void playLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playLabelMouseClicked
        if (!isStarted) {
            playSong();
            playLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/pauseBig.png")));
        } else {
            pauseSong();
            playLabel.setIcon(new ImageIcon(getClass().getResource("/musicplayer/icons/playBig.png")));
        }
    }//GEN-LAST:event_playLabelMouseClicked

    private void repeatLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repeatLabelMouseClicked
        repeatSong();
    }//GEN-LAST:event_repeatLabelMouseClicked

    private void openFileLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openFileLabelMouseClicked
        openFile();
    }//GEN-LAST:event_openFileLabelMouseClicked

    private void forbackLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forbackLabelMouseClicked
        forback();
    }//GEN-LAST:event_forbackLabelMouseClicked

    private void forwardLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forwardLabelMouseClicked
        forward();
    }//GEN-LAST:event_forwardLabelMouseClicked

    private void playSong() {
        try {
            if (songFiles == null) {
                throw new NullPointerException();
            }
            //there is a thread is suspended resume it... else get new thread
            if (playThread != null) {
                playThread.resume();
            } else {
                playThread = new Thread(playSong);
                playThread.start();
            }
            isStarted = true;
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Enter any mp3 file", "Please choose file", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    private void pauseSong() {
        try {
            //set thread is not started
            isStarted = false;
            //stop Thread
            playThread.suspend();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Enter any mp3 file", "Please choose file", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            System.out.println(ex.toString() + " in pause");
        }
    }

    private void stopSong() {
        try {
            playThread.stop();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    private void repeatSong() {
        if (!repeat) {
            repeat = true;
        } else {
            repeat = false;
        }

    }

    private void openFile() {
        try {
            JFileChooser chooser = new JFileChooser("user.home");
            chooser.setFileFilter(new FileNameExtensionFilter("mp3", "mp3"));
            chooser.setMultiSelectionEnabled(true);
            int result = chooser.showOpenDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                //if there is an old song.. stop it (make it = null)
                if (playThread != null) {
                    playThread.stop();
                    playThread = null;
                }
                //get file which choosed
                songFiles = chooser.getSelectedFiles();
                //set path
                songPath = songFiles[filesCounter].getPath();
                //set name
                songName = songFiles[filesCounter].getName();
                playSong();
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Enter any mp3 file", "Please choose file", JOptionPane.ERROR_MESSAGE);
            openFile();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    private void forback() {
        try {
            if (filesCounter > 0) {
                filesCounter--;
                playThread.stop();
                playThread = null;
                playSong();
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Enter any mp3 file", "Please choose file", JOptionPane.ERROR_MESSAGE);
            openFile();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    private void forward() {
        try {
            if (filesCounter < songFiles.length - 1) {
                filesCounter++;
                playThread.stop();
                playThread = null;
                playSong();
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Enter any mp3 file", "Please choose file", JOptionPane.ERROR_MESSAGE);
            openFile();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    Runnable playSong = new Runnable() {

        @Override
        public void run() {
            try {
                do {

                    fileInput = new FileInputStream(songFiles[filesCounter]);
                    //set length song file 
                    songLength = fileInput.available();
                    //init player
                    Player player = new Player(new BufferedInputStream(fileInput));
                    setSongName();
                    //run player
                    player.play();
                    //after run this sound...
                    filesCounter++;
                } while (repeat || filesCounter < songFiles.length);
                //rester counter after run all songs
                filesCounter = 0;
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Enter any mp3 file", "Please choose file", JOptionPane.ERROR_MESSAGE);
                openFile();
            } catch (Exception ex) {
                System.out.println(ex.toString() + " in play thread");
            }

        }

    };

    private void setSongName() {
        songName = songFiles[filesCounter].getName();
        if (songName.length() > 18) {
            songNameLabel.setText(songName.substring(0, 18) + "\n" + songName.substring(18));
        } else {
            songNameLabel.setText(songName);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MusicPlayer().setVisible(true);
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JLabel audioRunLabel;
    private javax.swing.JLabel downSoundLabel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel forbackLabel;
    private javax.swing.JLabel forwardLabel;
    private javax.swing.JPanel framePanel;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel muteSoundLabel;
    private javax.swing.JLabel nameAppLabel;
    private javax.swing.JLabel openFileLabel;
    private javax.swing.JLabel playLabel;
    private javax.swing.JLabel repeatLabel;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JLabel songIconLabel;
    private javax.swing.JLabel songIconLabel2;
    private javax.swing.JLabel songNameLabel;
    private javax.swing.JPanel songNamePanel;
    private javax.swing.JLabel upSoundLabel;
    // End of variables declaration//GEN-END:variables
}
