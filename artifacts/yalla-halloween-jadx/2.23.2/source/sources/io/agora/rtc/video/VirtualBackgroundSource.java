package io.agora.rtc.video;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualBackgroundSource {
    public static final int BACKGROUND_BLUR = 3;
    public static final int BACKGROUND_COLOR = 1;
    public static final int BACKGROUND_IMG = 2;
    public static final int BLUR_DEGREE_HIGH = 3;
    public static final int BLUR_DEGREE_LOW = 1;
    public static final int BLUR_DEGREE_MEDIUM = 2;
    public int backgroundSourceType;
    public int blur_degree;
    public int color;
    public String source;

    public VirtualBackgroundSource(int i, int i2, String str, int i3) {
        this.backgroundSourceType = i;
        this.color = i2;
        this.source = str;
        this.blur_degree = i3;
    }

    public VirtualBackgroundSource() {
        this.backgroundSourceType = 1;
        this.color = 16777215;
        this.source = "";
        this.blur_degree = 3;
    }
}
