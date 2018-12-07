package fr.wildcodeschool.pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import fr.wildcodeschool.pattern.abstractfactory.AbstractFactory;
import fr.wildcodeschool.pattern.abstractfactory.CPU;
import fr.wildcodeschool.pattern.abstractfactory.GPU;
import fr.wildcodeschool.pattern.staticbuild.Student;

import static fr.wildcodeschool.pattern.abstractfactory.AbstractFactory.Architecture;
import static fr.wildcodeschool.pattern.abstractfactory.AbstractFactory.Architecture.INTEL;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    CPU cpu = AbstractFactory.getFactory(INTEL).createCPU();

  }
}
