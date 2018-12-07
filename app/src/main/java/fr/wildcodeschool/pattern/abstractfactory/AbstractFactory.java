package fr.wildcodeschool.pattern.abstractfactory;

public abstract class AbstractFactory {
  private static final NvidiaFactory NVIDIA_FACTORY = new NvidiaFactory();
  private static final IntelFactory INTEL_FACTORY = new IntelFactory();
  private static final AmdFactory AMD_FACTORY = new AmdFactory();

  // TODO - Access from outside of the package
  public enum Architecture { NVIDIA, AMD, INTEL }

  // Returns a concrete factory object that is an instance of the
  // concrete factory class appropriate for the given architecture.
  // TODO - Access from outside of the package
  public static AbstractFactory getFactory(Architecture architecture) {
    AbstractFactory factory = null;
    switch (architecture) {
      case NVIDIA:
        factory = NVIDIA_FACTORY;
        break;
      case AMD:
        factory = AMD_FACTORY;
        break;
      case INTEL:
        factory = INTEL_FACTORY;
        break;
    }
    return factory;
  }

  // TODO - Access from outside of the package
  public abstract CPU createCPU();

  // TODO - Access from outside of the package
  public abstract GPU createGPU();
}
