package com.yalla.yalla.common.fs;

import android.os.StatFs;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class StorageVolume {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f20603OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f20604OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public StatFs f20605OooO0OO;

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
        this.f20604OooO0O0 = str;
        this.f20603OooO00o = z;
        StatFs statFs = new StatFs(str);
        this.f20605OooO0OO = statFs;
        BigInteger.valueOf(statFs.getBlockCount()).multiply(BigInteger.valueOf(this.f20605OooO0OO.getBlockSize()));
        BigInteger.valueOf(this.f20605OooO0OO.getFreeBlocks()).multiply(BigInteger.valueOf(this.f20605OooO0OO.getBlockSize()));
    }

    public final boolean equals(Object obj) {
        String str;
        return (obj == null || !(obj instanceof StorageVolume) || (str = this.f20604OooO0O0) == null || str.equals("")) ? super.equals(obj) : this.f20604OooO0O0.equals(((StorageVolume) obj).f20604OooO0O0);
    }
}
