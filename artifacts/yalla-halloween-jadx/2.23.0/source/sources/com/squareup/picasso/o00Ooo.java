package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final long f21789OooOOo = TimeUnit.SECONDS.toNanos(5);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f21790OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f21791OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f21792OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f21793OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Uri f21794OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f21796OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f21797OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f21798OooO0oo;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final Bitmap.Config f21805OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final Picasso.Priority f21806OooOOo0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<o0O0O00> f21795OooO0o = null;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f21799OooOO0 = false;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f21800OooOO0O = false;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final float f21801OooOO0o = 0.0f;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final float f21803OooOOO0 = 0.0f;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final float f21802OooOOO = 0.0f;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f21804OooOOOO = false;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Uri f21807OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f21808OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f21809OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f21810OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Bitmap.Config f21811OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f21812OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Picasso.Priority f21813OooO0oO;

        public OooO00o(Uri uri, Bitmap.Config config) {
            this.f21807OooO00o = uri;
            this.f21811OooO0o = config;
        }

        public final void OooO00o(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            }
            this.f21809OooO0OO = i;
            this.f21810OooO0Oo = i2;
        }
    }

    public o00Ooo(Uri uri, int i, int i2, int i3, boolean z, Bitmap.Config config, Picasso.Priority priority) {
        this.f21794OooO0Oo = uri;
        this.f21796OooO0o0 = i;
        this.f21797OooO0oO = i2;
        this.f21798OooO0oo = i3;
        this.f21790OooO = z;
        this.f21805OooOOOo = config;
        this.f21806OooOOo0 = priority;
    }

    public final boolean OooO00o() {
        return (this.f21797OooO0oO == 0 && this.f21798OooO0oo == 0) ? false : true;
    }

    public final String OooO0O0() {
        long jNanoTime = System.nanoTime() - this.f21792OooO0O0;
        if (jNanoTime > f21789OooOOo) {
            return OooO0Oo() + '+' + TimeUnit.NANOSECONDS.toSeconds(jNanoTime) + 's';
        }
        return OooO0Oo() + '+' + TimeUnit.NANOSECONDS.toMillis(jNanoTime) + "ms";
    }

    public final boolean OooO0OO() {
        return OooO00o() || this.f21801OooOO0o != 0.0f;
    }

    public final String OooO0Oo() {
        return androidx.compose.foundation.layout.OooO0O0.OooO00o(new StringBuilder("[R"), this.f21791OooO00o, ']');
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f21796OooO0o0;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f21794OooO0Oo);
        }
        List<o0O0O00> list = this.f21795OooO0o;
        if (list != null && !list.isEmpty()) {
            for (o0O0O00 o0o0o00 : list) {
                sb.append(' ');
                sb.append(o0o0o00.key());
            }
        }
        int i2 = this.f21797OooO0oO;
        if (i2 > 0) {
            sb.append(" resize(");
            sb.append(i2);
            sb.append(',');
            sb.append(this.f21798OooO0oo);
            sb.append(')');
        }
        if (this.f21790OooO) {
            sb.append(" centerCrop");
        }
        if (this.f21799OooOO0) {
            sb.append(" centerInside");
        }
        float f = this.f21801OooOO0o;
        if (f != 0.0f) {
            sb.append(" rotation(");
            sb.append(f);
            if (this.f21804OooOOOO) {
                sb.append(" @ ");
                sb.append(this.f21803OooOOO0);
                sb.append(',');
                sb.append(this.f21802OooOOO);
            }
            sb.append(')');
        }
        Bitmap.Config config = this.f21805OooOOOo;
        if (config != null) {
            sb.append(' ');
            sb.append(config);
        }
        sb.append('}');
        return sb.toString();
    }
}
