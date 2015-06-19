package affichage;

import grille.Grille;
import grille.Pattern;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import sound.SonBase;
import sound.SonBois;
import sound.SonErase;
import sound.SonMetal;
import sound.SonPierre;
import sound.SonVerre;
import utils.Properties;
import cells.Base;
import cells.Bois;
import cells.Cellule;
import cells.Metal;
import cells.Pierre;
import cells.SegmentBranche;
import cells.Verre;
import cells.Vide;

public class Plateau extends JPanel {

	private static final long serialVersionUID = 1L;

	private Grille grille;
	private static String matiere = "bois";
	private Pattern pat;
	private boolean fin = false;
	private static boolean sound = true;
	private Ecran ecr;
	private int nbEx;
	//private static SonAmbiance musique = new SonAmbiance();// TODO Faire
															// fonctionner la
															// musique sans
															// qu'elle fasse
															// tout planter

	protected final Plateau that;

	/**
	 * Constructeur privé qui initialise le MouseListener
	 */
	private Plateau(int nbEx, Ecran e) {
		that = this;
		this.nbEx = nbEx;
		ecr = e;
		pat = new Pattern(nbEx);
		if (nbEx == -1) {
			addMouseListener(new MouseListener() {
				private SonBase sonBase;
				private SonBois sonBois;
				private SonErase sonErase;
				private SonMetal sonMetal;
				private SonPierre sonPierre;
				private SonVerre sonVerre;

				@Override
				public void mouseReleased(MouseEvent e) {
				}

				@Override
				public void mousePressed(MouseEvent e) {
				}

				@Override
				public void mouseExited(MouseEvent e) {
				}

				@Override
				public void mouseEntered(MouseEvent e) {
				}

				@Override
				public void mouseClicked(MouseEvent e) {
					int x = e.getX();
					int y = e.getY();

					if (matiere.equals("verre")) {
						grille.setCellule(x / Cellule.SIZE, y / Cellule.SIZE,
								new Verre(x / Cellule.SIZE, y / Cellule.SIZE));
						if (sound == true) {
							if (sonVerre == null) {
								sonVerre = new SonVerre();
							}
							sonVerre.jouer();
							// sonVerre.arreter();
						}
						
					} else if (matiere.equals("base")) {
						grille.setCellule(x / Cellule.SIZE, y / Cellule.SIZE,
								new Base(x / Cellule.SIZE, y / Cellule.SIZE));
						if (sound == true) {
							if (sonBase == null) {
								sonBase = new SonBase();
							}
							sonBase.jouer();
							// sonBase.arreter();
						}
					}
					

					else if (matiere.equals("metal")) {
						grille.setCellule(x / Cellule.SIZE, y / Cellule.SIZE,
								new Metal(x / Cellule.SIZE, y / Cellule.SIZE));
						if (sound == true) {
							if (sonMetal == null) {
								sonMetal = new SonMetal();
							}
							sonMetal.jouer();
							// sonMetal.arreter();
						}
					}

					else if (matiere.equals("pierre")) {
						grille.setCellule(x / Cellule.SIZE, y / Cellule.SIZE,
								new Pierre(x / Cellule.SIZE, y / Cellule.SIZE));
						if (sound == true) {
							if (sonPierre == null) {
								sonPierre = new SonPierre();
							}
							sonPierre.jouer();
							// sonPierre.arreter();
						}
					}

					else if (matiere.equals("bois")) {
						grille.setCellule(x / Cellule.SIZE, y / Cellule.SIZE,
								new Bois(x / Cellule.SIZE, y / Cellule.SIZE));
						if (sound == true) {
							if (sonBois == null) {
								sonBois = new SonBois();
							}
							sonBois.jouer();
							// sonBois.arreter();
						}
					}

					else if (matiere.equals("vide")) {
						grille.setCellule(x / Cellule.SIZE, y / Cellule.SIZE,
								new Vide(x / Cellule.SIZE, y / Cellule.SIZE));
						if (sound == true) {
							if (sonErase == null) {
								sonErase = new SonErase();
							}
							sonErase.jouer();
							// sonErase.arreter();
						}
					}

					ecr.repaint();
					repaint();
				}
			});
		} else {
			addMouseListener(new MouseListener() {
				private SonBase sonBase;
				private SonBois sonBois;
				private SonErase sonErase;
				private SonMetal sonMetal;
				private SonPierre sonPierre;
				private SonVerre sonVerre;

				@Override
				public void mouseReleased(MouseEvent e) {
				}

				@Override
				public void mousePressed(MouseEvent e) {
				}

				@Override
				public void mouseExited(MouseEvent e) {
				}

				@Override
				public void mouseEntered(MouseEvent e) {
				}

				/**
				 * Event de clic On essaie de récupérer la Cellule à l'endroit
				 * du clique -> Si elle existe, on appelle la méthode
				 * 'mouseClicked' de la Cellule -> Si elle n'existe pas, on
				 * print l'exception
				 */
				@Override
				public void mouseClicked(MouseEvent e) {
					int x = e.getX();
					int y = e.getY();

					if (fin == false) {

						// Est-ce que le carré cliqué est une branche?
						try {
							grille.getCellule(x / Cellule.SIZE,
									y / Cellule.SIZE).mouseClicked(e);
							if (grille.getCellule(x / Cellule.SIZE,
									y / Cellule.SIZE).isBranche()) {
								SegmentBranche cell = (SegmentBranche) grille
										.getCellule(x / Cellule.SIZE, y
												/ Cellule.SIZE);
								cell.infos(grille);

								// Sinon, est-elle dispo?
							} else if (grille.getCellule(x / Cellule.SIZE,
									y / Cellule.SIZE).isDispo()) {

								// Si oui, on teste la matière actuelle
								if (matiere.equals("base")) {

									// On s'assure que la base soit unique
									if (grille.containsBase()) {
										JOptionPane
												.showMessageDialog(
														null,
														null,
														"Base unique!",
														JOptionPane.PLAIN_MESSAGE,
														null);
									} else {
										grille.setCellule(x / Cellule.SIZE, y
												/ Cellule.SIZE, new Base(x
												/ Cellule.SIZE, y
												/ Cellule.SIZE));
										// On teste si il faut du son
										if (sound == true) {
											if (sonBase == null) {
												sonBase = new SonBase();
											}
											sonBase.jouer();
											// sonBase.arreter();
										}

									}
								}

								// Le fonctionnement est le même partout
								// ailleurs
								else if (matiere.equals("verre")) {
									grille.setCellule(x / Cellule.SIZE, y
											/ Cellule.SIZE, new Verre(x
											/ Cellule.SIZE, y / Cellule.SIZE));
									if (sound == true) {
										if (sonVerre == null) {
											sonVerre = new SonVerre();
										}
										sonVerre.jouer();
										// sonVerre.arreter();
									}

								}

								else if (matiere.equals("metal")) {
									grille.setCellule(x / Cellule.SIZE, y
											/ Cellule.SIZE, new Metal(x
											/ Cellule.SIZE, y / Cellule.SIZE));
									if (sound == true) {
										if (sonMetal == null) {
											sonMetal = new SonMetal();
										}
										sonMetal.jouer();
										// sonMetal.arreter();
									}

								}

								else if (matiere.equals("pierre")) {
									grille.setCellule(x / Cellule.SIZE, y
											/ Cellule.SIZE, new Pierre(x
											/ Cellule.SIZE, y / Cellule.SIZE));
									if (sound == true) {
										if (sonPierre == null) {
											sonPierre = new SonPierre();
										}
										sonPierre.jouer();
										// sonPierre.arreter();
									}

								}

								else if (matiere.equals("bois")) {
									grille.setCellule(x / Cellule.SIZE, y
											/ Cellule.SIZE, new Bois(x
											/ Cellule.SIZE, y / Cellule.SIZE));
									if (sound == true) {
										if (sonBois == null) {
											sonBois = new SonBois();
										}
										sonBois.jouer();
										// sonBois.arreter();
									}

								}

								else if (matiere.equals("vide")) {
									grille.setCellule(x / Cellule.SIZE, y
											/ Cellule.SIZE, new Vide(x
											/ Cellule.SIZE, y / Cellule.SIZE));

									if (sound == true) {
										if (sonErase == null) {
											sonErase = new SonErase();
										}
										sonErase.jouer();
										// sonErase.arreter();
									}
								}
							}
							grille.replacerBlocs(that);
							ecr.repaint();
							repaint();

							// repaint();

							if (!grille.isOkay()) {
								fin = true;
								final JFrame jw = new JFrame();
								jw.setPreferredSize(new Dimension(300,170));
								jw.setResizable(false);
								BufferedImage fond = ImageIO.read(new File("./res/fondDefaite.png"));
								jw.setContentPane(new ImagePanel(fond));
								jw.setLocation(600, 300);
								jw.setAlwaysOnTop(true);
								jw.setLayout(new BorderLayout());
								
								JPanel jp = new JPanel(new FlowLayout());
								jp.setPreferredSize(new Dimension(300,70));
								jp.setBackground(new Color(0,0,0,1));
								
								JButton retour = new JButton(new ImageIcon(
										"./res/boutons/boutonRetour.png"));
								retour.setBackground(new Color(0,0,0,1));
								retour.setPreferredSize(new Dimension(130,50));
								retour.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent arg0) {
										try {
											new MenuPrincipal();
										} catch (IOException e) {
											e.printStackTrace();
										}
										jw.setVisible(false);
										jw.dispose();
										ecr.getSelecteur().setVisible(false);
										ecr.getSelecteur().dispose();
										ecr.setVisible(false);
										ecr.dispose();
									}
								});
								
								jp.add(retour);
								jw.add(jp, BorderLayout.SOUTH);
								jw.pack();
								jw.setVisible(true);
								
								
							} else if (grille.containsBase()) {
								if (grille.contains(pat)) {
									fin = true;
									final JFrame jw = new JFrame();
									jw.setPreferredSize(new Dimension(300,170));
									jw.setResizable(false);
									BufferedImage fond = ImageIO.read(new File("./res/fondVictoire.png"));
									jw.setContentPane(new ImagePanel(fond));
									jw.setLocation(600, 300);
									jw.setAlwaysOnTop(true);
									jw.setLayout(new BorderLayout());
									
									JPanel jp = new JPanel(new FlowLayout());
									jp.setPreferredSize(new Dimension(300,70));
									jp.setBackground(new Color(0,0,0,1));
									
									JButton retour = new JButton(new ImageIcon(
											"./res/boutons/boutonRetour.png"));
									retour.setBackground(new Color(0,0,0,1));
									retour.setPreferredSize(new Dimension(130,50));
									retour.addActionListener(new ActionListener() {

										@Override
										public void actionPerformed(ActionEvent arg0) {
											try {
												new MenuPrincipal();
											} catch (IOException e) {
												e.printStackTrace();
											}
											jw.setVisible(false);
											jw.dispose();
											ecr.getSelecteur().setVisible(false);
											ecr.getSelecteur().dispose();
											ecr.setVisible(false);
											ecr.dispose();
										}
									});
									
									jp.add(retour);
									jw.add(jp, BorderLayout.SOUTH);
									jw.pack();
									jw.setVisible(true);
								}
							}
						} catch (ArrayIndexOutOfBoundsException ex) {
							System.err.println(ex.getMessage());
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			});
		}
	}

	/**
	 * Constructeur du plateau
	 * 
	 * @param grille
	 */
	public Plateau(Grille grille, int nbEx, Ecran ecr) {
		this(nbEx, ecr);
		setPreferredSize(new Dimension(
				Properties.WIDTH * Properties.SIZE_CELLS, Properties.HEIGHT
						* Properties.SIZE_CELLS));
		this.setGrille(grille);
	}

	/**
	 * 
	 * @return grille de jeu
	 */
	public Grille getGrille() {
		return grille;
	}

	/**
	 * Modifie la grille de jeu
	 * 
	 * @param grille
	 */
	public void setGrille(Grille grille) {
		this.grille = grille;
	}

	/**
	 * Methode d'affichage du Plateau
	 */
	@Override
	public void paint(Graphics g) {
		for (int i = 0; i < grille.getWidth(); i++)
			for (int j = 0; j < grille.getHeight(); j++)
				grille.getCellule(i, j).paint(g);
	}

	public void repaintEcran() {
		ecr.repaint();
	}

	public String getMatiere() {
		return matiere;
	}

	public static void setMatiere(String mat) {
		matiere = mat;
	}

	public Pattern getPat() {
		return pat;
	}

	public int getNbEx() {
		return nbEx;
	}

	public static boolean getSound() {
		return sound;
	}

	public static void setSound(boolean son) {
		sound = son;
//		if (son = true) {
//			musique.start();
//		} else {
//			musique.interrupt();
//		}
	}
}
