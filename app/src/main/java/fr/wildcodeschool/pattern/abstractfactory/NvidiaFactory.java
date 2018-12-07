package fr.wildcodeschool.pattern.abstractfactory;

// class NvidiaGPU
class NvidiaGPU extends GPU {}

// class NvidiaFactory
class NvidiaFactory extends AbstractFactory {
  @Override
  public CPU createCPU() {
    return null;
  }

  @Override
  public GPU createGPU() {
    return new NvidiaGPU();
  }
}

