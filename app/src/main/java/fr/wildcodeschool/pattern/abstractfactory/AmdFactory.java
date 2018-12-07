package fr.wildcodeschool.pattern.abstractfactory;

// class AmdCPU
class AmdCPU extends CPU {}

// class AmdGPU
class AmdGPU extends GPU {}



// class AmdFactory
class AmdFactory extends AbstractFactory {
  @Override
  public CPU createCPU() {
    return new AmdCPU();
  }

  @Override
  public GPU createGPU() {
    return new AmdGPU();
  }
}
