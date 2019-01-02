package fr.wildcodeschool.pattern;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import fr.wildcodeschool.pattern.abstractfactory.AbstractFactory;
import fr.wildcodeschool.pattern.abstractfactory.CPU;
import fr.wildcodeschool.pattern.abstractfactory.GPU;
import fr.wildcodeschool.pattern.builder.Inflater;
import fr.wildcodeschool.pattern.nestedbuilder.Student;
import fr.wildcodeschool.pattern.listener.AudioPlayer;
import fr.wildcodeschool.pattern.listener.Listener;
import fr.wildcodeschool.pattern.singleton.AudioManager;

import static fr.wildcodeschool.pattern.abstractfactory.AbstractFactory.Architecture.INTEL;
import static fr.wildcodeschool.pattern.abstractfactory.AbstractFactory.Architecture.NVIDIA;

@SuppressWarnings("unused")
public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    abstractFactoryExample();
    builderExample();
    innerBuilderExample();
    listenerExample();
    singletonExample();
  }

  //---------------------------------------------------------------------------

  /**
   * AbstractFactory pattern example
   */
  private void abstractFactoryExample() {
    CPU Cpu = AbstractFactory.getFactory(INTEL).createCPU();
    GPU Gpu = AbstractFactory.getFactory(NVIDIA).createGPU();
  }

  //---------------------------------------------------------------------------

  /**
   * Builder pattern example
   */
  private void builderExample() {
    Inflater lInflater = new Inflater();
    lInflater.inflate(this, builderParcelableContent());
  }

  private List<Inflater.LayoutDetail> builderParcelableContent() {
    List<Inflater.LayoutDetail> lList = new ArrayList<>();

    // ------------------------------------------------------------------------
    // Item creation
    // ------------------------------------------------------------------------
    Inflater.LayoutDetail lGridItem = new Inflater.LayoutDetail();
    // Set item name
    lGridItem.setLayoutName("GridLayout");
    // Set item details
    HashMap<String, String> lGridAttr = new HashMap<>();
    lGridAttr.put("margin", "10");
    lGridAttr.put("anchor", "10");
    // Populate item
    lGridItem.setLayoutDetail(lGridAttr);
    lList.add(lGridItem);

    // ------------------------------------------------------------------------
    // Item creation
    // ------------------------------------------------------------------------
    Inflater.LayoutDetail lLinearItem = new Inflater.LayoutDetail();
    // Set item name
    lLinearItem.setLayoutName("LinearLayout");
    // Set item details
    HashMap<String, String> lLinearAttr = new HashMap<>();
    lLinearAttr.put("anchor", "10");
    lLinearAttr.put("padding", "10");
    // Populate item
    lLinearItem.setLayoutDetail(lLinearAttr);
    lList.add(lLinearItem);

    return lList;
  }

  //---------------------------------------------------------------------------

  /**
   * innerBuilder pattern example
   */
  private void innerBuilderExample() {
    Student lStudent = new Student.Builder()
      .setFirstname("Dupond")
      .setLastname("Eric")
      .setAge("18")
      .build();
  }

  //---------------------------------------------------------------------------

  /**
   * Listener/Callback pattern example
   */
  private void listenerExample() {
    // Create 2 listeners
    Listener listener1 = new Listener("#1");
    Listener listener2 = new Listener("#2");

    // Create the audio player
    AudioPlayer player = new AudioPlayer();
    player.addListener(listener1);
    player.addListener(listener2);

    // Simulate onPrepare & onCompletion method
    player.forceOnPrepared();
    player.forceOnCompletion();

    player.removeListener(listener1);
    player.removeListener(listener2);
  }

  //---------------------------------------------------------------------------

  /**
   * Singleton pattern example
   */
  private void singletonExample() {
    AudioManager lManager = AudioManager.getInstance();
  }
}
