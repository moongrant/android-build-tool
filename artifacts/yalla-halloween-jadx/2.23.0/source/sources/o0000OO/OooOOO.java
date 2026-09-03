package o0000OO;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f34119OooO00o;

    public static final class OooO0O0 implements OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final Uri f34121OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public final ClipDescription f34122OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final Uri f34123OooO0OO;

        public OooO0O0(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.f34121OooO00o = uri;
            this.f34122OooO0O0 = clipDescription;
            this.f34123OooO0OO = uri2;
        }

        @Override // o0000OO.OooOOO.OooO0OO
        @Nullable
        public final Object OooO00o() {
            return null;
        }

        @Override // o0000OO.OooOOO.OooO0OO
        @NonNull
        public final Uri OooO0O0() {
            return this.f34121OooO00o;
        }

        @Override // o0000OO.OooOOO.OooO0OO
        public final void OooO0OO() {
        }

        @Override // o0000OO.OooOOO.OooO0OO
        @Nullable
        public final Uri OooO0Oo() {
            return this.f34123OooO0OO;
        }

        @Override // o0000OO.OooOOO.OooO0OO
        @NonNull
        public final ClipDescription getDescription() {
            return this.f34122OooO0O0;
        }
    }

    public interface OooO0OO {
        @Nullable
        Object OooO00o();

        @NonNull
        Uri OooO0O0();

        void OooO0OO();

        @Nullable
        Uri OooO0Oo();

        @NonNull
        ClipDescription getDescription();
    }

    public OooOOO(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f34119OooO00o = new OooO00o(uri, clipDescription, uri2);
        } else {
            this.f34119OooO00o = new OooO0O0(uri, clipDescription, uri2);
        }
    }

    @RequiresApi(25)
    public static final class OooO00o implements OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final InputContentInfo f34120OooO00o;

        public OooO00o(@NonNull Object obj) {
            this.f34120OooO00o = (InputContentInfo) obj;
        }

        @Override // o0000OO.OooOOO.OooO0OO
        @NonNull
        public final Object OooO00o() {
            return this.f34120OooO00o;
        }

        @Override // o0000OO.OooOOO.OooO0OO
        @NonNull
        public final Uri OooO0O0() {
            return this.f34120OooO00o.getContentUri();
        }

        @Override // o0000OO.OooOOO.OooO0OO
        public final void OooO0OO() {
            this.f34120OooO00o.requestPermission();
        }

        @Override // o0000OO.OooOOO.OooO0OO
        @Nullable
        public final Uri OooO0Oo() {
            return this.f34120OooO00o.getLinkUri();
        }

        @Override // o0000OO.OooOOO.OooO0OO
        @NonNull
        public final ClipDescription getDescription() {
            return this.f34120OooO00o.getDescription();
        }

        public OooO00o(@NonNull Uri uri, @NonNull ClipDescription clipDescription, @Nullable Uri uri2) {
            this.f34120OooO00o = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public OooOOO(@NonNull OooO00o oooO00o) {
        this.f34119OooO00o = oooO00o;
    }
}
