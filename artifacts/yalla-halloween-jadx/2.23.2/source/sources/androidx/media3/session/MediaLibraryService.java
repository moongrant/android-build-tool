package androidx.media3.session;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MediaLibraryService extends MediaSessionService {

    public static final class OooO00o implements androidx.media3.common.OooO0OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @UnstableApi
        public final Bundle f9202OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f9203OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f9204OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f9205OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final String f9198OooO0oo = p080o000OoO.o00.Oooo00o(0);

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final String f9197OooO = p080o000OoO.o00.Oooo00o(1);

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final String f9199OooOO0 = p080o000OoO.o00.Oooo00o(2);

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final String f9200OooOO0O = p080o000OoO.o00.Oooo00o(3);

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @UnstableApi
        public static final o00 f9201OooOO0o = new o00();

        public OooO00o(Bundle bundle, boolean z, boolean z2, boolean z3) {
            this.f9202OooO0Oo = new Bundle(bundle);
            this.f9204OooO0o0 = z;
            this.f9203OooO0o = z2;
            this.f9205OooO0oO = z3;
        }

        @Override // androidx.media3.common.OooO0OO
        @UnstableApi
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f9198OooO0oo, this.f9202OooO0Oo);
            bundle.putBoolean(f9197OooO, this.f9204OooO0o0);
            bundle.putBoolean(f9199OooOO0, this.f9203OooO0o);
            bundle.putBoolean(f9200OooOO0O, this.f9205OooO0oO);
            return bundle;
        }
    }

    public static final class OooO0O0 extends o00O000 {
    }

    @Override // androidx.media3.session.MediaSessionService
    @Nullable
    public final /* bridge */ /* synthetic */ void OooO0O0(o00O000.OooO00o oooO00o) {
        OooO0OO();
    }

    @Nullable
    public abstract OooO0O0 OooO0OO();

    @Override // androidx.media3.session.MediaSessionService, android.app.Service
    @Nullable
    public final IBinder onBind(@Nullable Intent intent) {
        MediaSessionService.OooO00o oooO00o;
        if (intent == null) {
            return null;
        }
        if (!"androidx.media3.session.MediaLibraryService".equals(intent.getAction())) {
            return super.onBind(intent);
        }
        synchronized (this.f9206OooO0Oo) {
            oooO00o = this.f9208OooO0o0;
            p080o000OoO.o00Oo0.OooO0o(oooO00o);
        }
        return oooO00o;
    }
}
