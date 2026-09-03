package p074o000O0oo;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f28226OooO00o;

    public static final class OooO0O0 implements OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final Uri f28228OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public final ClipDescription f28229OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final Uri f28230OooO0OO;

        public OooO0O0(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.f28228OooO00o = uri;
            this.f28229OooO0O0 = clipDescription;
            this.f28230OooO0OO = uri2;
        }

        @Override // o000O0oo.Oooo000.OooO0OO
        @NonNull
        public final Uri OooO00o() {
            return this.f28228OooO00o;
        }

        @Override // o000O0oo.Oooo000.OooO0OO
        public final void OooO0O0() {
        }

        @Override // o000O0oo.Oooo000.OooO0OO
        @Nullable
        public final Uri OooO0OO() {
            return this.f28230OooO0OO;
        }

        @Override // o000O0oo.Oooo000.OooO0OO
        @Nullable
        public final Object OooO0Oo() {
            return null;
        }

        @Override // o000O0oo.Oooo000.OooO0OO
        @NonNull
        public final ClipDescription getDescription() {
            return this.f28229OooO0O0;
        }
    }

    public interface OooO0OO {
        @NonNull
        Uri OooO00o();

        void OooO0O0();

        @Nullable
        Uri OooO0OO();

        @Nullable
        Object OooO0Oo();

        @NonNull
        ClipDescription getDescription();
    }

    public Oooo000(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f28226OooO00o = new OooO00o(uri, clipDescription, uri2);
        } else {
            this.f28226OooO00o = new OooO0O0(uri, clipDescription, uri2);
        }
    }

    @RequiresApi(25)
    public static final class OooO00o implements OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final InputContentInfo f28227OooO00o;

        public OooO00o(@NonNull Object obj) {
            this.f28227OooO00o = (InputContentInfo) obj;
        }

        @Override // o000O0oo.Oooo000.OooO0OO
        @NonNull
        public final Uri OooO00o() {
            return this.f28227OooO00o.getContentUri();
        }

        @Override // o000O0oo.Oooo000.OooO0OO
        public final void OooO0O0() {
            this.f28227OooO00o.requestPermission();
        }

        @Override // o000O0oo.Oooo000.OooO0OO
        @Nullable
        public final Uri OooO0OO() {
            return this.f28227OooO00o.getLinkUri();
        }

        @Override // o000O0oo.Oooo000.OooO0OO
        @NonNull
        public final Object OooO0Oo() {
            return this.f28227OooO00o;
        }

        @Override // o000O0oo.Oooo000.OooO0OO
        @NonNull
        public final ClipDescription getDescription() {
            return this.f28227OooO00o.getDescription();
        }

        public OooO00o(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.f28227OooO00o = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public Oooo000(@NonNull OooO0OO oooO0OO) {
        this.f28226OooO00o = oooO0OO;
    }
}
