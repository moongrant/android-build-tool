package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p028Oooo0o0.o0O0ooO;
import p420o0Oo0ooO.oO00o00O;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final long f19764OooOOo = TimeUnit.SECONDS.toNanos(5);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f19765OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f19766OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f19767OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f19768OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Uri f19769OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f19771OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f19772OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f19773OooO0oo;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final Bitmap.Config f19780OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final Picasso.Priority f19781OooOOo0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<oO00o00O> f19770OooO0o = null;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f19774OooOO0 = false;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f19775OooOO0O = false;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final float f19776OooOO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final float f19778OooOOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final float f19777OooOOO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f19779OooOOOO = false;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Uri f19782OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f19783OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f19784OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f19785OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Bitmap.Config f19786OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f19787OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Picasso.Priority f19788OooO0oO;

        public OooO00o(Uri uri, Bitmap.Config config) {
            this.f19782OooO00o = uri;
            this.f19786OooO0o = config;
        }

        public final OooO00o OooO00o(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.f19784OooO0OO = i;
            this.f19785OooO0Oo = i2;
            return this;
        }
    }

    public Oooo0(Uri uri, int i, int i2, int i3, boolean z, Bitmap.Config config, Picasso.Priority priority) {
        this.f19769OooO0Oo = uri;
        this.f19771OooO0o0 = i;
        this.f19772OooO0oO = i2;
        this.f19773OooO0oo = i3;
        this.f19765OooO = z;
        this.f19780OooOOOo = config;
        this.f19781OooOOo0 = priority;
    }

    public final boolean OooO00o() {
        return (this.f19772OooO0oO == 0 && this.f19773OooO0oo == 0) ? false : true;
    }

    public final String OooO0O0() {
        long jNanoTime = System.nanoTime() - this.f19767OooO0O0;
        if (jNanoTime > f19764OooOOo) {
            return OooO0Oo() + '+' + TimeUnit.NANOSECONDS.toSeconds(jNanoTime) + 's';
        }
        return OooO0Oo() + '+' + TimeUnit.NANOSECONDS.toMillis(jNanoTime) + "ms";
    }

    public final boolean OooO0OO() {
        return OooO00o() || this.f19776OooOO0o != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public final String OooO0Oo() {
        return o0O0ooO.OooO00o(OooO00o.OooO00o.OooO0o0("[R"), this.f19766OooO00o, ']');
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f19771OooO0o0;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f19769OooO0Oo);
        }
        List<oO00o00O> list = this.f19770OooO0o;
        if (list != null && !list.isEmpty()) {
            for (oO00o00O oo00o00o : this.f19770OooO0o) {
                sb.append(' ');
                sb.append(oo00o00o.key());
            }
        }
        if (this.f19772OooO0oO > 0) {
            sb.append(" resize(");
            sb.append(this.f19772OooO0oO);
            sb.append(',');
            sb.append(this.f19773OooO0oo);
            sb.append(')');
        }
        if (this.f19765OooO) {
            sb.append(" centerCrop");
        }
        if (this.f19774OooOO0) {
            sb.append(" centerInside");
        }
        if (this.f19776OooOO0o != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            sb.append(" rotation(");
            sb.append(this.f19776OooOO0o);
            if (this.f19779OooOOOO) {
                sb.append(" @ ");
                sb.append(this.f19778OooOOO0);
                sb.append(',');
                sb.append(this.f19777OooOOO);
            }
            sb.append(')');
        }
        if (this.f19780OooOOOo != null) {
            sb.append(' ');
            sb.append(this.f19780OooOOOo);
        }
        sb.append('}');
        return sb.toString();
    }
}
