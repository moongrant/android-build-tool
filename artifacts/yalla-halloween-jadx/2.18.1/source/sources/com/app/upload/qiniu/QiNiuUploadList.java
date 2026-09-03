package com.app.upload.qiniu;

import android.text.TextUtils;
import com.app.impl.UploadSingleCallback;
import com.app.model.UploadModel;
import java.util.ArrayList;
import java.util.List;
import p179o00o0.o000oOoO;
import p179o00o0.o00Oo0;
import p179o00o0.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class QiNiuUploadList {
    private String mToken;
    private int tag;
    private o00Oo0<UploadModel> resultListCallback = null;
    private o0OoOo0 progressListCallback = null;
    private List<UploadModel> mListModelResult = null;
    private List<QiNiuUploadSingle> mListQiNiuUploadSingle = null;

    public QiNiuUploadList(String str) {
        this.mToken = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onIsFinish(UploadModel uploadModel, List<UploadModel> list) {
        this.mListModelResult.add(uploadModel);
        if (this.mListModelResult.size() == list.size()) {
            o00Oo0<UploadModel> o00oo1 = this.resultListCallback;
            if (o00oo1 != null) {
                o00oo1.OooO0O0();
            }
            List<QiNiuUploadSingle> list2 = this.mListQiNiuUploadSingle;
            if (list2 != null) {
                list2.clear();
            }
        }
    }

    public QiNiuUploadList addProgressListCallback(o0OoOo0 o0oooo1) {
        this.progressListCallback = o0oooo1;
        return this;
    }

    public QiNiuUploadList addResultListCallback(o00Oo0<UploadModel> o00oo1) {
        this.resultListCallback = o00oo1;
        return this;
    }

    public QiNiuUploadList toPauseUpload() {
        List<QiNiuUploadSingle> list = this.mListQiNiuUploadSingle;
        if (list != null) {
            for (QiNiuUploadSingle qiNiuUploadSingle : list) {
                if (qiNiuUploadSingle != null) {
                    qiNiuUploadSingle.toPauseUpload();
                }
            }
        }
        return this;
    }

    public QiNiuUploadList toUpload(List<UploadModel> list, int i) {
        return toUpload(list, i, true);
    }

    public QiNiuUploadList toUpload(final List<UploadModel> list, int i, boolean z) {
        this.tag = i;
        if (list == null || list.isEmpty()) {
            o00Oo0<UploadModel> o00oo1 = this.resultListCallback;
            if (o00oo1 != null) {
                o00oo1.OooO0O0();
            }
            return this;
        }
        this.mListModelResult = new ArrayList();
        this.mListQiNiuUploadSingle = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            UploadModel uploadModel = list.get(i2);
            if (uploadModel == null || TextUtils.isEmpty(uploadModel.getPath())) {
                onIsFinish(uploadModel, list);
            } else {
                this.mListQiNiuUploadSingle.add(new QiNiuUploadSingle(this.mToken).addProgressCallback(new o000oOoO() { // from class: com.app.upload.qiniu.QiNiuUploadList.2
                    @Override // p179o00o0.o000oOoO
                    public void progress(int i3) {
                        if (QiNiuUploadList.this.progressListCallback != null) {
                            o0OoOo0 o0oooo1 = QiNiuUploadList.this.progressListCallback;
                            list.size();
                            QiNiuUploadList.this.mListModelResult.size();
                            o0oooo1.OooO00o();
                        }
                    }
                }).addUploadSingleCallback(new UploadSingleCallback() { // from class: com.app.upload.qiniu.QiNiuUploadList.1
                    @Override // com.app.impl.UploadSingleCallback
                    public void result(UploadSingleCallback.State state, UploadModel uploadModel2) {
                        QiNiuUploadList.this.onIsFinish(uploadModel2, list);
                    }
                }).toUpload(uploadModel.setId(i2), z));
            }
        }
        return this;
    }
}
