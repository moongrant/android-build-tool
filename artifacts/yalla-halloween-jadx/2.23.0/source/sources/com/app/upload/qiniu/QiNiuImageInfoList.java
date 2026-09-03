package com.app.upload.qiniu;

import com.app.model.ImageInfoModel;
import com.app.upload.Upload;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import oo0o0O0.OooO0O0;
import oo0o0O0.OooO0OO;
import oo0o0O0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class QiNiuImageInfoList {
    private OooO0O0 progressListCallback;
    private OooO0o<ImageInfoModel> resultListCallback;
    private int tag;
    private ArrayList<String> imageList = null;
    private Map<Integer, ImageInfoModel> qiNiuImageInfoModelMap = null;

    private List<ImageInfoModel> getFinishList() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.qiNiuImageInfoModelMap.size(); i++) {
            arrayList.add(this.qiNiuImageInfoModelMap.get(Integer.valueOf(i)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onListener(int i, ImageInfoModel imageInfoModel) {
        this.qiNiuImageInfoModelMap.put(Integer.valueOf(i), imageInfoModel);
    }

    public QiNiuImageInfoList addProgressCallback(OooO0O0 oooO0O0) {
        return this;
    }

    public QiNiuImageInfoList addResultListCallback(OooO0o<ImageInfoModel> oooO0o) {
        return this;
    }

    public void getImageInfoList(ArrayList<String> arrayList, int i) {
        this.imageList = arrayList;
        this.tag = i;
        this.qiNiuImageInfoModelMap = new HashMap();
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (final int i2 = 0; i2 < arrayList.size(); i2++) {
            Upload.getImageInfoSingle().addResultCallback(new OooO0OO<ImageInfoModel>() { // from class: com.app.upload.qiniu.QiNiuImageInfoList.1
                @Override // oo0o0O0.OooO0OO
                public void result(boolean z, ImageInfoModel imageInfoModel) {
                    QiNiuImageInfoList.this.onListener(i2, imageInfoModel);
                }
            }).getQiNiuImageInfo(arrayList.get(i2));
        }
    }
}
