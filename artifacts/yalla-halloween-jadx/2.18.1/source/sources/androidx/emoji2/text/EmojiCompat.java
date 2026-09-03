package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.AnyThread;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p021OooOooo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
public final class EmojiCompat {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Object f8079OooO = new Object();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("INSTANCE_LOCK")
    public static volatile EmojiCompat f8080OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ReentrantReadWriteLock f8081OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    @GuardedBy("mInitLock")
    public final Set<OooO> f8082OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mInitLock")
    public volatile int f8083OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Handler f8084OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final OooOO0O f8085OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final OooO00o f8086OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f8087OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final androidx.emoji2.text.OooO0o f8088OooO0oo;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface CodepointSequenceMatchResult {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface LoadStrategy {
    }

    public static abstract class OooO {
        public void OooO00o() {
        }

        public void OooO0O0() {
        }
    }

    @RequiresApi(19)
    public static final class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public volatile androidx.emoji2.text.OooOO0O f8089OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public volatile OooOo f8090OooO0OO;

        /* JADX INFO: renamed from: androidx.emoji2.text.EmojiCompat$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0050OooO00o extends OooOOO0 {
            public C0050OooO00o() {
            }

            @Override // androidx.emoji2.text.EmojiCompat.OooOOO0
            public final void OooO00o(@Nullable Throwable th) {
                OooO00o.this.f8092OooO00o.OooO0o(th);
            }

            @Override // androidx.emoji2.text.EmojiCompat.OooOOO0
            public final void OooO0O0(@NonNull OooOo oooOo) {
                OooO00o oooO00o = OooO00o.this;
                oooO00o.f8090OooO0OO = oooOo;
                oooO00o.f8089OooO0O0 = new androidx.emoji2.text.OooOO0O(oooO00o.f8090OooO0OO, new OooOOO(), oooO00o.f8092OooO00o.f8088OooO0oo);
                oooO00o.f8092OooO00o.OooO0oO();
            }
        }

        public OooO00o(EmojiCompat emojiCompat) {
            super(emojiCompat);
        }

        public final void OooO00o() {
            try {
                this.f8092OooO00o.f8085OooO0o.OooO00o(new C0050OooO00o());
            } catch (Throwable th) {
                this.f8092OooO00o.OooO0o(th);
            }
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final EmojiCompat f8092OooO00o;

        public OooO0O0(EmojiCompat emojiCompat) {
            this.f8092OooO00o = emojiCompat;
        }
    }

    public static abstract class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final OooOO0O f8093OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f8094OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public androidx.emoji2.text.OooO0o f8095OooO0OO = new androidx.emoji2.text.OooO0o();

        public OooO0OO(@NonNull OooOO0O oooOO0O) {
            this.f8093OooO00o = oooOO0O;
        }
    }

    public interface OooO0o {
    }

    public static class OooOO0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final List<OooO> f8096Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Throwable f8097Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final int f8098Oooo0oo;

        public OooOO0(@NonNull Collection<OooO> collection, int i, @Nullable Throwable th) {
            o000OO0O.OooOOO0.OooO0Oo(collection, "initCallbacks cannot be null");
            this.f8096Oooo0o = new ArrayList(collection);
            this.f8098Oooo0oo = i;
            this.f8097Oooo0oO = th;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.emoji2.text.EmojiCompat$OooO>] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<androidx.emoji2.text.EmojiCompat$OooO>] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<androidx.emoji2.text.EmojiCompat$OooO>] */
        @Override // java.lang.Runnable
        public final void run() {
            int size = this.f8096Oooo0o.size();
            int i = 0;
            if (this.f8098Oooo0oo != 1) {
                while (i < size) {
                    ((OooO) this.f8096Oooo0o.get(i)).OooO00o();
                    i++;
                }
            } else {
                while (i < size) {
                    ((OooO) this.f8096Oooo0o.get(i)).OooO0O0();
                    i++;
                }
            }
        }
    }

    public interface OooOO0O {
        void OooO00o(@NonNull OooOOO0 oooOOO0);
    }

    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooOOO {
    }

    public static abstract class OooOOO0 {
        public abstract void OooO00o(@Nullable Throwable th);

        public abstract void OooO0O0(@NonNull OooOo oooOo);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ReplaceStrategy {
    }

    public EmojiCompat(@NonNull OooO0OO oooO0OO) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f8081OooO00o = reentrantReadWriteLock;
        this.f8083OooO0OO = 3;
        this.f8085OooO0o = oooO0OO.f8093OooO00o;
        int i = oooO0OO.f8094OooO0O0;
        this.f8087OooO0oO = i;
        this.f8088OooO0oo = oooO0OO.f8095OooO0OO;
        this.f8084OooO0Oo = new Handler(Looper.getMainLooper());
        this.f8082OooO0O0 = new o0OoOo0(0);
        OooO00o oooO00o = new OooO00o(this);
        this.f8086OooO0o0 = oooO00o;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f8083OooO0OO = 0;
            } catch (Throwable th) {
                this.f8081OooO00o.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (OooO0O0() == 0) {
            oooO00o.OooO00o();
        }
    }

    @NonNull
    public static EmojiCompat OooO00o() {
        EmojiCompat emojiCompat;
        synchronized (f8079OooO) {
            emojiCompat = f8080OooOO0;
            o000OO0O.OooOOO0.OooO0o0(emojiCompat != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return emojiCompat;
    }

    public static boolean OooO0OO() {
        return f8080OooOO0 != null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:53:0x00db
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @androidx.annotation.Nullable
    @androidx.annotation.CheckResult
    public final java.lang.CharSequence OooO(@androidx.annotation.Nullable java.lang.CharSequence r17, @androidx.annotation.IntRange(from = kotlin.ULong.MIN_VALUE) int r18, @androidx.annotation.IntRange(from = kotlin.ULong.MIN_VALUE) int r19) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.EmojiCompat.OooO(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final int OooO0O0() {
        this.f8081OooO00o.readLock().lock();
        try {
            return this.f8083OooO0OO;
        } finally {
            this.f8081OooO00o.readLock().unlock();
        }
    }

    public final boolean OooO0Oo() {
        return OooO0O0() == 1;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [OooOooo.o0OoOo0, java.util.Set<androidx.emoji2.text.EmojiCompat$OooO>] */
    public final void OooO0o(@Nullable Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f8081OooO00o.writeLock().lock();
        try {
            this.f8083OooO0OO = 2;
            arrayList.addAll(this.f8082OooO0O0);
            this.f8082OooO0O0.clear();
            this.f8081OooO00o.writeLock().unlock();
            this.f8084OooO0Oo.post(new OooOO0(arrayList, this.f8083OooO0OO, th));
        } catch (Throwable th2) {
            this.f8081OooO00o.writeLock().unlock();
            throw th2;
        }
    }

    public final void OooO0o0() {
        o000OO0O.OooOOO0.OooO0o0(this.f8087OooO0oO == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (OooO0Oo()) {
            return;
        }
        this.f8081OooO00o.writeLock().lock();
        try {
            if (this.f8083OooO0OO == 0) {
                this.f8081OooO00o.writeLock().unlock();
                return;
            }
            this.f8083OooO0OO = 0;
            this.f8081OooO00o.writeLock().unlock();
            OooO00o oooO00o = this.f8086OooO0o0;
            Objects.requireNonNull(oooO00o);
            try {
                oooO00o.f8092OooO00o.f8085OooO0o.OooO00o(oooO00o.new C0050OooO00o());
            } catch (Throwable th) {
                oooO00o.f8092OooO00o.OooO0o(th);
            }
        } catch (Throwable th2) {
            this.f8081OooO00o.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [OooOooo.o0OoOo0, java.util.Set<androidx.emoji2.text.EmojiCompat$OooO>] */
    public final void OooO0oO() {
        ArrayList arrayList = new ArrayList();
        this.f8081OooO00o.writeLock().lock();
        try {
            this.f8083OooO0OO = 1;
            arrayList.addAll(this.f8082OooO0O0);
            this.f8082OooO0O0.clear();
            this.f8081OooO00o.writeLock().unlock();
            this.f8084OooO0Oo.post(new OooOO0(arrayList, this.f8083OooO0OO, null));
        } catch (Throwable th) {
            this.f8081OooO00o.writeLock().unlock();
            throw th;
        }
    }

    @Nullable
    @CheckResult
    public final CharSequence OooO0oo(@Nullable CharSequence charSequence) {
        return OooO(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [OooOooo.o0OoOo0, java.util.Set<androidx.emoji2.text.EmojiCompat$OooO>] */
    public final void OooOO0(@NonNull OooO oooO) {
        o000OO0O.OooOOO0.OooO0Oo(oooO, "initCallback cannot be null");
        this.f8081OooO00o.writeLock().lock();
        try {
            if (this.f8083OooO0OO == 1 || this.f8083OooO0OO == 2) {
                this.f8084OooO0Oo.post(new OooOO0(Arrays.asList(oooO), this.f8083OooO0OO, null));
            } else {
                this.f8082OooO0O0.add(oooO);
            }
        } finally {
            this.f8081OooO00o.writeLock().unlock();
        }
    }
}
