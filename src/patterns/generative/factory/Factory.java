package patterns.generative.factory;

public class Factory {
    public OS getCurrentOS(String osName) throws Exception {
        OS os;
        switch (osName) {
            case "windows":
                os = new WindowsOS();
                break;
            case "linux":
                os = new Linux();
                break;
            case "mac":
                os = new Mac();
                break;
            default:
                throw new Exception("no such os");
        }
        return os;
    }
}
