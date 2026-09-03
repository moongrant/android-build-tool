package com.app.upload.qiniu;

import android.text.TextUtils;
import com.app.impl.UploadSingleCallback;
import com.app.model.UploadModel;
import java.util.ArrayList;
import java.util.List;
import p675oOooo0o.o0000;
import p675oOooo0o.o0000Ooo;
import p675oOooo0o.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class QiNiuUploadList {
    private List<UploadModel> mListModelResult = null;
    private List<QiNiuUploadSingle> mListQiNiuUploadSingle = null;
    private String mToken;
    private o0000 progressListCallback;
    private o0000oo<UploadModel> resultListCallback;
    private int tag;

    public QiNiuUploadList(String str) {
        this.mToken = str;
    }

    public static /* synthetic */ o0000 access$100(QiNiuUploadList qiNiuUploadList) {
        qiNiuUploadList.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onIsFinish(UploadModel uploadModel, List<UploadModel> list) {
        List<QiNiuUploadSingle> list2;
        this.mListModelResult.add(uploadModel);
        if (this.mListModelResult.size() != list.size() || (list2 = this.mListQiNiuUploadSingle) == null) {
            return;
        }
        list2.clear();
    }

    public QiNiuUploadList addProgressListCallback(o0000 o0000Var) {
        return this;
    }

    public QiNiuUploadList addResultListCallback(o0000oo<UploadModel> o0000ooVar) {
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
        if (list != null && !list.isEmpty()) {
            this.mListModelResult = new ArrayList();
            this.mListQiNiuUploadSingle = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                UploadModel uploadModel = list.get(i2);
                if (uploadModel == null || TextUtils.isEmpty(uploadModel.getPath())) {
                    onIsFinish(uploadModel, list);
                } else {
                    this.mListQiNiuUploadSingle.add(new QiNiuUploadSingle(this.mToken).addProgressCallback(new o0000Ooo() { // from class: com.app.upload.qiniu.QiNiuUploadList.2
                        @Override // p675oOooo0o.o0000Ooo
                        public void progress(int i3) {
                            QiNiuUploadList.access$100(QiNiuUploadList.this);
                        }
                    }).addUploadSingleCallback(new UploadSingleCallback() { // from class: com.app.upload.qiniu.QiNiuUploadList.1
                        @Override // com.app.impl.UploadSingleCallback
                        public void result(UploadSingleCallback.State state, UploadModel uploadModel2) {
                            QiNiuUploadList.this.onIsFinish(uploadModel2, list);
                        }
                    }).toUpload(uploadModel.setId(i2), z));
                }
            }
        }
        return this;
    }
}
