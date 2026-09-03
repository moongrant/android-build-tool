package com.yalla.yalla.download.fs;

import android.os.StatFs;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class StorageVolume {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f22917OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f22918OooO0O0;

    public enum StorageVolumeState {
        STATE_MOUNTED,
        STATE_NOT_MOUNTED,
        STATE_UNKNOWN;

        @Override // java.lang.Enum
        public final String toString() {
            if (this == STATE_MOUNTED) {
                return "STATE_MOUNTED";
            }
            if (this == STATE_NOT_MOUNTED) {
                return "STATE_NOT_MOUNTED";
            }
            return this == STATE_UNKNOWN ? "STATE_UNKNOWN" : super.toString();
        }
    }

    public StorageVolume(String str, boolean z) {
        this.f22918OooO0O0 = str;
        this.f22917OooO00o = z;
        StatFs statFs = new StatFs(str);
        BigInteger.valueOf(statFs.getBlockCount()).multiply(BigInteger.valueOf(statFs.getBlockSize()));
        BigInteger.valueOf(statFs.getFreeBlocks()).multiply(BigInteger.valueOf(statFs.getBlockSize()));
    }

    public final boolean equals(Object obj) {
        String str;
        return (obj == null || !(obj instanceof StorageVolume) || (str = this.f22918OooO0O0) == null || str.equals("")) ? super.equals(obj) : str.equals(((StorageVolume) obj).f22918OooO0O0);
    }
}
