package top.defaults.gradientdrawabletuner.db;

import top.defaults.gradientdrawabletuner.GradientDrawableProperties;

public class DrawableSpecFactory {

    public static DrawableSpec rectangleSample(String name) {
        GradientDrawableProperties properties = GradientDrawableProperties.Factory.createRectangleSample();
        return new DrawableSpec(name, properties);
    }
}
