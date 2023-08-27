package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStory implements IModelChangeObserver, IModelChanger {
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private IModelChangeObserver changeObserver;

    public ModelStory(IModelChangeObserver changeObserver){
        this.changeObserver = changeObserver;
        this.models = new PoligonalModel(null);
        this.cameras = new Camera();
        this.flashes = new Flash();
        this.scenes = new Scene(this.models, this.flashes, this.cameras)
    }

    public Scene getScene(int n) {
        return this.scenes;
    }

    @Override
    public void applyUpdateModel() {
    }

    @Override
    public void notifyChange(IModelChanger sender) {
    }
}