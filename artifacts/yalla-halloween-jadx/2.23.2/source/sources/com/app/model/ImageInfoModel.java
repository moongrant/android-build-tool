package com.app.model;

import android.app.Activity;
import android.view.WindowManager;
import com.app.upload.qiniu.QiNiuImageUrlHelper;
import java.io.Serializable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public class ImageInfoModel implements Serializable {
    private String colorModel;
    private String format;
    private int frameNumber;
    private int height;
    private String orientation;
    private int size;
    private String url;
    private int width;

    public String getColorModel() {
        return this.colorModel;
    }

    public String getFormat() {
        return this.format;
    }

    public int getFrameNumber() {
        return this.frameNumber;
    }

    public int getHeight() {
        return this.height;
    }

    public String getOrientation() {
        return this.orientation;
    }

    public int getSize() {
        return this.size;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUrlThumbnail(Activity activity) {
        if (activity == null || (getWidth() == 0 && getHeight() == 0)) {
            return this.url;
        }
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        int width = windowManager.getDefaultDisplay().getWidth();
        int height = windowManager.getDefaultDisplay().getHeight();
        double width2 = (((double) width) / ((double) getWidth())) * 100.0d;
        double height2 = (((double) height) / ((double) getHeight())) * 100.0d;
        if (height2 > width2) {
            width2 = height2;
        }
        return QiNiuImageUrlHelper.getUrl(this.url, width2);
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isGif() {
        return "gif".equals(this.format) && this.frameNumber > 1;
    }

    public ImageInfoModel setUrl(String str) {
        this.url = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImageInfoModel{size=");
        sb.append(this.size);
        sb.append(", format='");
        sb.append(this.format);
        sb.append("', width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", colorModel='");
        sb.append(this.colorModel);
        sb.append("', frameNumber=");
        sb.append(this.frameNumber);
        sb.append(", orientation='");
        sb.append(this.orientation);
        sb.append("'\n url='");
        return o0oOO.OooO0O0(sb, this.url, "'}");
    }
}
