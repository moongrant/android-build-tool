package p046Oooooo0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.EncoderProfilesProxy;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f1997OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1998OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final EncoderProfilesProxy.VideoProfileProxy f1999OooO0OO;

    public static final class OooO00o extends o0OoOoOo.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f2000OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f2001OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public EncoderProfilesProxy.VideoProfileProxy f2002OooO0OO;

        public final o0 OooO00o() {
            String strConcat = this.f2000OooO00o == null ? " mimeType" : "";
            if (this.f2001OooO0O0 == null) {
                strConcat = strConcat.concat(" profile");
            }
            if (strConcat.isEmpty()) {
                return new o0(this.f2000OooO00o, this.f2001OooO0O0.intValue(), this.f2002OooO0OO);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
    }

    public o0(String str, int i, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.f1997OooO00o = str;
        this.f1998OooO0O0 = i;
        this.f1999OooO0OO = videoProfileProxy;
    }

    @Override // p046Oooooo0.o0O00000
    @NonNull
    public final String OooO00o() {
        return this.f1997OooO00o;
    }

    @Override // p046Oooooo0.o0O00000
    public final int OooO0O0() {
        return this.f1998OooO0O0;
    }

    @Override // p046Oooooo0.o0OoOoOo
    @Nullable
    public final EncoderProfilesProxy.VideoProfileProxy OooO0OO() {
        return this.f1999OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0OoOoOo)) {
            return false;
        }
        o0OoOoOo o0oooooo = (o0OoOoOo) obj;
        if (this.f1997OooO00o.equals(o0oooooo.OooO00o()) && this.f1998OooO0O0 == o0oooooo.OooO0O0()) {
            EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.f1999OooO0OO;
            if (videoProfileProxy == null) {
                if (o0oooooo.OooO0OO() == null) {
                    return true;
                }
            } else if (videoProfileProxy.equals(o0oooooo.OooO0OO())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f1997OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f1998OooO0O0) * 1000003;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.f1999OooO0OO;
        return iHashCode ^ (videoProfileProxy == null ? 0 : videoProfileProxy.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.f1997OooO00o + ", profile=" + this.f1998OooO0O0 + ", compatibleVideoProfile=" + this.f1999OooO0OO + "}";
    }
}
