package p046Oooooo0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.EncoderProfilesProxy;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f2007OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f2008OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final EncoderProfilesProxy.VideoProfileProxy f2009OooO0OO;

    public static final class OooO00o extends o0OoOoOo.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f2010OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f2011OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public EncoderProfilesProxy.VideoProfileProxy f2012OooO0OO;

        public final o0 OooO00o() {
            String strConcat = this.f2010OooO00o == null ? " mimeType" : "";
            if (this.f2011OooO0O0 == null) {
                strConcat = strConcat.concat(" profile");
            }
            if (strConcat.isEmpty()) {
                return new o0(this.f2010OooO00o, this.f2011OooO0O0.intValue(), this.f2012OooO0OO);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
    }

    public o0(String str, int i, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.f2007OooO00o = str;
        this.f2008OooO0O0 = i;
        this.f2009OooO0OO = videoProfileProxy;
    }

    @Override // p046Oooooo0.o0O00000
    @NonNull
    public final String OooO00o() {
        return this.f2007OooO00o;
    }

    @Override // p046Oooooo0.o0O00000
    public final int OooO0O0() {
        return this.f2008OooO0O0;
    }

    @Override // p046Oooooo0.o0OoOoOo
    @Nullable
    public final EncoderProfilesProxy.VideoProfileProxy OooO0OO() {
        return this.f2009OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0OoOoOo)) {
            return false;
        }
        o0OoOoOo o0oooooo = (o0OoOoOo) obj;
        if (this.f2007OooO00o.equals(o0oooooo.OooO00o()) && this.f2008OooO0O0 == o0oooooo.OooO0O0()) {
            EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.f2009OooO0OO;
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
        int iHashCode = (((this.f2007OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f2008OooO0O0) * 1000003;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.f2009OooO0OO;
        return iHashCode ^ (videoProfileProxy == null ? 0 : videoProfileProxy.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.f2007OooO00o + ", profile=" + this.f2008OooO0O0 + ", compatibleVideoProfile=" + this.f2009OooO0OO + "}";
    }
}
