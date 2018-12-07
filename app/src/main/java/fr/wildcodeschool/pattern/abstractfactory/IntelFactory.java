package fr.wildcodeschool.pattern.abstractfactory;

// class IntelCPU
class IntelCPU extends CPU {}

// class IntelGPU
class IntelGPU extends GPU {}



// class IntelFactory
class IntelFactory extends AbstractFactory {
  @Override
  public CPU createCPU() {
    return new IntelCPU();
  }

  @Override
  public GPU createGPU() {
    return new IntelGPU();
  }
}
