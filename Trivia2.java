package trivia2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class Trivia2 extends javax.swing.JFrame {
    Fondo fondo = new Fondo ();
    public int npregunta=0;
    public int puntaje=0;
    String nombre;
    
    static String textoBasedePreguntas = "¿Se genera de manera natural en el medio ambiente y se da en una gran variedad de formas, al igual que el plomo y el cadmio, es un elemento constitutivo de la tierra, un metal pesado?\tMercurio\tFluor\tPlomo\tCalcio"
            + "\n"
            + "¿Es uno de los metales que desde hace más tiempo conocieron y emplearon los hombres, tanto por lo mucho que abunda en la Tierra como por su facilidad para fundirse?\tCarbono\tOro\tYodo\tPlomo"
            + "\n"
            + "¿Este elemento químico podría provocar una catástrofe climática que impediría que los seres humanos podamos seguir habitar en la tierra?\tTungsteno\tOsminio\tCarbono\tCalcio"
            + "\n"
            + "¿Es un elemento fundamental que nuestras plantas necesitan para crecer adecuadamente, actualmente se usa cómo fertilizante?\tPlomo\tArsenico\tNiquel\tNitrogeno"
            + "\n"
            + "¿Es aquel elemento que puede llegar a dañar nuestra piel, maltratar el cabello, dañar a las plantas y nuestra salud por su uso excesivo?\tZinc\tCloro\tYodo\tPotasio"
            + "\n"
            + "¿La exposición excesiva de este elemento, puede provocar dolor y daño en los huesos y las articulaciones durante muchos años lo que aumenta el riesgo de sufrir fracturas?\tFluor\tCloro\tRutenio\tIridio"
            + "\n"
            + "¿Es mayoritariamente tóxico para los organismos, puede alterar el material genético y causar cáncer?\tIndio\tGermanio\tCromo\tPaladio"
            + "\n"
            + "¿Es un mineral indispensable para el buen funcionamiento del organismo del ser humano, se obtiene mediante la alimentación y ejerce diversas funciones biológicas, principalmente antioxidantes?\tSelenio\tAntimonio\tCobalto\tNitrogeno"
            + "\n"
            + "¿Se encuentra disperso en pequeñas proporciones de rocas volcánicas y sales naturales, pero nunca libre, dada su gran reactividad?\tBoro\tPlata\tSelenio\tLitio"
            + "\n"
            + "¿Es un elemento químico que puede ser solido o polvo metálico de color plata, este puede afectar por inhalación y al hacer contacto con él, puede irritar, quemar la piel, nariz y ojos?\tZinc\tHiero\tVanadio\tBario"
            + "\n"
            + "¿Este elemento se encuentra en el aire, el agua y en los alimentos, respirar niveles altos puede dañar los pulmones, producir náusea y vómitos?\tVanadio\tCromo\tEstaño\tCobre"
            + "\n"
            + "¿Elemento que, al ser inhalado por ciertas cantidades excesivas sin darse cuenta, ya que es muy usado por la manufactura, afecta gravemente a los pulmones, provocar cáncer y hasta causar la muerte?\tIndio\tVanadio\tCobalto\tCadmio"
            + "\n"
            + "¿¿Debido a que es liviano y fuerte, es un elemento químico que tiene muchos usos en las industrias electrónica, aeroespacial y de defensa?\tBerilio\tPlata\tCobalto\tFosforo"
            + "\n"
            + "¿Constituye en ser un elemento clave en muchos procesos fisiológicos y bioquímicos, aparece en estructuras complejas de ADN y ARN que, al contener y codificar la información genética, controlan todos los procesos biológicos en las plantas?\tNitrogeno\tCloro\tBoro\tFosforo"
            + "\n"
            + "¿Elemento químico no metálico que tiene un color amarillo, una textura quebradiza, no tiene olor, es insípido e insoluble en agua?\tOro\tPlata\tAzufre\tZinc"
            + "\n"
            + "¿Es un elemento natural que se encuentra en la tierra y entre los minerales, se usan para preservar la madera, como plaguicidas y en ciertas industrias?\tCobre\tArsenico\tPlata\tHierro"
            + "\n"
            + "¿Es uno de los metales menos abundantes en la corteza terrestre, comprendiendo el 0,008% de esta, las mayores fuentes de este elemento químico metálico provienen de los meteoritos?\tNiquel\tCobre\tOro\tCromo"
            + "\n"
            + "¿Es un elemento metálico que provino de las profundidades de la Tierra hace millones de años, impulsado por los procesos geológicos que esculpieron nuestro planeta y al llegar cerca de la superficie dio origen a diversos tipos de yacimientos?\tPlata\tOro\tArsenico\tCobre"
            + "\n"
            + "¿Es un elemento o metal nativo bastante abundante en la corteza de la tierra, que es importante debido a que tiene una infinidad de aplicaciones industriales, biológicas y medicinales?\tZinc\tPotasio\tYodo\tTungsteno"
            + "\n"
            + "¿Es un elemento muy común en la Naturaleza, aunque nunca se presenta en estado libre, sino combinado, formando parte de arcillas, margas, micas, feldespato, caolín, etc.?\tBario\tAluminio\tLitio\tMercurio"
            + "\n"
            + "¿Se trata de un metal, con aspecto entre gris, blanco y brillante con lo que es muy diferente de otros metales que se distinguen fácilmente, se crean mediante aleaciones o bien son más corrientes en general?\tPlata\tOro\tAluminio\tCobre"
            + "\n"
            + "¿Es un metal raro, constituido sólo 0,004% de la corteza terrestre,\n" 
            +"la producción mundial es de alrededor de 220 000 toneladas por año, extracto principalmente de minerales de estannita y casiterita?\tCarbono\tOro\tEstaño\tPlomo"
            + "\n"
            + "¿Es uno de los elementos más importantes que existen en la Tierra, ya que gracias a él se puede generar la conocida como energía nuclear?\tSelenio\tAntimonio\tCobalto\tUranio"
            + "\n"
            + "¿Es un material radioactivo producido en reactores nucleares; solamente cantidades muy pequeñas ocurren naturalmente, trabajadores expuestos a este elemento químico han desarrollado cáncer del pulmón, el hígado y los huesos?\tPlutonio\tGermanio\tCromo\tPaladio"
            + "\n"
            + "¿Es un metal esencial desde el punto de vista biológico y se utiliza sobre todo en aceros aleados?\tPlata\tMolibdeno\tEstaño\tUranio"
            + "\n"
            + "El titanio se encuentra en la naturaleza, ¿Cuál es su rareza en la corteza terrestre?\tAbudante en la corteza terrestra\tMuy dificil su hallazgo\tSe encuentra en el agua\tNo hay"
            + "\n"
            + "¿Para que es utilizado el hierro en la vida cotidiana?\tCimiento de las cuidades\tPara la plantacion de arboles\tPropiedades fisicas y quimicas\tGastronomia"
            + "\n"
            + "¿Cuál es la aplicación del manganeso en las industrias del mundo?\tIndustria Quimica\tIndustria Quimica\tIndustria Automotriz\tIndustria Mercantil"
            + "\n"
            + "¿Cómo se presenta el sodio en la naturaleza?\tEn la basura\tEn los volcanes\tEn la naturaleza\tEn las cuidades"
            + "\n"
            + "¿Cómo afecta el yodo a la naturaleza? \tCombinada con materia organica\tPermanece en el mismo lugar\tLas plantas lo absorven/tPuede precipitar en el agua"
            + "\n"
            + "¿Qué efectos tiene el boro en los seres humanos y en los mamíferos?\tDaños en el riñon\tExtremidades\tCapacidad auditiva\tSensaciones"
            + "\n"
            + "¿Cómo se presenta el cobalto en la naturaleza?\tDe forma natural\tForma sintetica\tEn el suelo\tErupciones Volcanicas"
            + "\n"
            + "¿Qué produce el antimonio al estar en el cuerpo humano? \tFalta de aire\tFalta de sueño\tNauseas\tVomitos"
            + "\n"
            + "¿Cuál es la función en el mundo del galio?\tIndustrial\tMedico\tFabricacion de luces\tCircuitos"
            + "\n"
            + "¿Propiedades que tiene el germanio?\tQuebradizo y Blanco\tEl metal mas fuerte del mundo\tEs de color negro\tEl peor metal del mundo"
            + "\n"
            + "¿En qué tipo de minerales se encuentra el renio?\tCobre\tPlomo\tGalio\tManganeso"
            + "\n"
            + "en el mundo se fabrican varios productos que contienen rutenio, ¿Cuáles productos son uno de ellos?\tJoyas\tPivotes Antimagneticos\tProductos de Limpieza\tComputacion"
            + "\n"
            + "¿Qué tan común es encontrar iridio en la naturaleza? \tSolo se encuentra una fraccion\tNada\tMas frecuente que el oro\tMenos frecuente que todos los elementos"
            + "\n"
            + "¿Tiene algun efecto negativo el rodio sobre el medio ambiente?\tNo tiene efectos negativos\tDaña a lo seres humanos\tDaño progresivo a la tierra\tDaños irreversibles a la naturaleza"
            + "\n"
            + "¿A qué clasificación pertenece el osmio?\tGrupo de platinos\tGrupo alcalino\tGrupo de los anhidridos\tGrupo alquinos"
            + "\n"
            + "¿Cuál sería la temperatura más alta que resiste el tungsteno?\t3240°C\t170°C\t20000000°C\t1°C"
            + "\n"
            + "¿Qué minerales del potasio se encuentran en la naturaleza?\tCarnalita\tCloro\tCobre\tAluminio"
            + "\n"
            + "¿Qué función realiza en la naturaleza el calcio? \tAyuda al cuerpo\tApoya al suelo\tComplementa el aire\tNada"
            + "\n"
            + "¿cuánto dura el cianuro en el ambiente?\tEntre 4 y 8 horas\t1 hora\t20 minutos\t1 semana entera";
        
    static String [] renglones= textoBasedePreguntas.split("\n");
                static int cantidadDePreguntas= renglones.length;
        static String[][] basedepreguntas= new String[cantidadDePreguntas][5];
    public static void main(String args[]) {
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception ex){
            
        }
        for(int i=0;i<renglones.length;i++){
            String renglon=renglones[i];
            basedepreguntas[i]= renglon.split("\t");
        }
         new Trivia2();
         
    }
    public Trivia2() {
        this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        Jugar();
    }
    
    public String[] preguntaEscogida;    
    public String pregunta;
    public String respuesta;
         public ArrayList<String> Opciones= new ArrayList<>();
    public void EscogerPregunta(int n){
        preguntaEscogida=basedepreguntas[n];
        pregunta=preguntaEscogida[0];
        respuesta=preguntaEscogida[1];
        Opciones.clear();
        for(int i=1;i<preguntaEscogida.length;i++){
            Opciones.add(preguntaEscogida[i]);
        }
        for (int i = 0; i < 4; i++) {
            Collections.shuffle(Opciones);
        }
        
    }
    public void EscogerRespuesta(int n){
        if(Opciones.get(n).equals(respuesta)){
            puntaje+=100;
            JOptionPane.showMessageDialog(this,"Has respondido bien!!","¡¡¡Excelente!!!",JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            JOptionPane.showMessageDialog(this,"Has respondido mal", "La proxima es la buena :(",JOptionPane.ERROR_MESSAGE);    
    }
        Jugar();
    }
    public void Jugar(){
        if (npregunta==cantidadDePreguntas) {
            JOptionPane.showMessageDialog(this, "Se acabo el juego, tu puntuación es: "+puntaje, "Felicidades, gracias por participar", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        EscogerPregunta(npregunta);
        MostrarPregunta();
        npregunta++;
    }
    public void MostrarPregunta(){
        jLabel1.setText(pregunta);
        jButton1.setText(Opciones.get(0));
        jButton3.setText(Opciones.get(1));
        jButton2.setText(Opciones.get(2));
        jButton4.setText(Opciones.get(3));
    }
class Fondo extends JPanel{
   private Image imagen; 
   @Override
   public void paint (Graphics g){
       imagen = new ImageIcon(getClass().getResource("/Imagenes/Imagen1.png")).getImage();
       g.drawImage(imagen, 0, 0, getWidth(), getHeight(), null);
       setOpaque (false);
       super.paint(g);
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setText("Respuesta 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Preguntas");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setText("Respuesta 3");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setText("Respuesta 2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton4.setText("Respuesta 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(600, 600, 600)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(199, 199, 199))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EscogerRespuesta(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        EscogerRespuesta(1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EscogerRespuesta(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        EscogerRespuesta(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
