package com.qiniu.android.http.serverRegion;

import com.qiniu.android.utils.Utils;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class UploadServerFreezeManager {
    private static final UploadServerFreezeManager manager = new UploadServerFreezeManager();
    private ConcurrentHashMap<String, UploadServerFreezeItem> frozenInfo = new ConcurrentHashMap<>();

    public static class UploadServerFreezeItem {
        private Date freezeDate;
        public final String type;

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void freeze(int i) {
            this.freezeDate = new Date(Utils.currentTimestamp() + ((long) (i * 1000)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized boolean isFrozenByDate(Date date) {
            Date date2;
            date2 = this.freezeDate;
            return date2 != null && date2.getTime() >= date.getTime();
        }

        private UploadServerFreezeItem(String str) {
            this.type = str;
        }
    }

    public static UploadServerFreezeManager getInstance() {
        return manager;
    }

    public void freezeType(String str, int i) {
        if (str == null || str.length() == 0) {
            return;
        }
        UploadServerFreezeItem uploadServerFreezeItem = this.frozenInfo.get(str);
        if (uploadServerFreezeItem == null) {
            uploadServerFreezeItem = new UploadServerFreezeItem(str);
            this.frozenInfo.put(str, uploadServerFreezeItem);
        }
        uploadServerFreezeItem.freeze(i);
    }

    public boolean isTypeFrozen(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        UploadServerFreezeItem uploadServerFreezeItem = this.frozenInfo.get(str);
        return uploadServerFreezeItem != null && uploadServerFreezeItem.isFrozenByDate(new Date());
    }

    public void unfreezeType(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.frozenInfo.remove(str);
    }
}
