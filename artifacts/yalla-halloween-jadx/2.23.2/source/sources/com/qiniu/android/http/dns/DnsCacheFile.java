package com.qiniu.android.http.dns;

import com.qiniu.android.storage.Recorder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class DnsCacheFile implements Recorder {
    public String directory;
    public File f;

    public DnsCacheFile(String str) throws IOException {
        if (str == null) {
            throw new IOException("directory invalid");
        }
        this.directory = str;
        File file = new File(str);
        this.f = file;
        if (!file.exists() && !this.f.mkdirs()) {
            throw new IOException("mkdir failed");
        }
        if (!this.f.isDirectory()) {
            throw new IOException("does not mkdir");
        }
    }

    @Override // com.qiniu.android.storage.Recorder
    public void del(String str) {
        if (str != null) {
            new File(this.directory, str).delete();
        }
    }

    @Override // com.qiniu.android.storage.Recorder
    public byte[] get(String str) {
        byte[] bArr;
        FileInputStream fileInputStream;
        int i;
        File file = new File(this.directory, str);
        try {
            bArr = new byte[(int) file.length()];
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    i = fileInputStream.read(bArr);
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    i = 0;
                }
            } catch (IOException e2) {
                e = e2;
                fileInputStream = null;
            }
        } catch (IOException e3) {
            e = e3;
            bArr = null;
            fileInputStream = null;
        }
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
        if (i == 0) {
            return null;
        }
        return bArr;
    }

    @Override // com.qiniu.android.storage.Recorder
    public String getFileName() {
        return "dnsCache";
    }

    @Override // com.qiniu.android.storage.Recorder
    public void set(String str, byte[] bArr) {
        FileOutputStream fileOutputStream;
        IOException e;
        File[] fileArrListFiles = this.f.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        if (fileArrListFiles.length > 0) {
            for (File file : fileArrListFiles) {
                del(file.getName());
            }
        }
        try {
            fileOutputStream = new FileOutputStream(new File(this.directory, str));
            try {
                fileOutputStream.write(bArr);
            } catch (IOException e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (IOException e3) {
            fileOutputStream = null;
            e = e3;
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        }
    }
}
