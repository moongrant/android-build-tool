package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.AnyThread;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
public final class EmojiCompat {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Object f5597OooOO0 = new Object();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    @GuardedBy("INSTANCE_LOCK")
    public static volatile EmojiCompat f5598OooOO0O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final androidx.emoji2.text.OooO f5599OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ReentrantReadWriteLock f5600OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    @GuardedBy("mInitLock")
    public final p190o00o0O.OooOO0O f5601OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mInitLock")
    public volatile int f5602OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final Handler f5603OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final OooOOO0 f5604OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final OooO00o f5605OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final OooO0o f5606OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f5607OooO0oo;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface CodepointSequenceMatchResult {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface LoadStrategy {
    }

    public interface OooO {
    }

    @RequiresApi(19)
    public static final class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public volatile OooOo00 f5608OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public volatile o0OoOo0 f5609OooO0OO;
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final EmojiCompat f5610OooO00o;

        public OooO0O0(EmojiCompat emojiCompat) {
            this.f5610OooO00o = emojiCompat;
        }
    }

    public static abstract class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final OooOOO0 f5611OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f5612OooO0O0 = 0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public final androidx.emoji2.text.OooO f5613OooO0OO = new androidx.emoji2.text.OooO();

        public OooO0OO(@NonNull OooOOO0 oooOOO0) {
            this.f5611OooO00o = oooOOO0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class OooO0o implements OooOOOO {
    }

    public static abstract class OooOO0 {
        public void onFailed(@Nullable Throwable th) {
        }

        public void onInitialized() {
        }
    }

    public static class OooOO0O implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ArrayList f5614OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f5615OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Throwable f5616OooO0o0;

        public OooOO0O(@NonNull List list, int i, @Nullable Throwable th) {
            o000OO.OooOOO0.OooO0o0(list, "initCallbacks cannot be null");
            this.f5614OooO0Oo = new ArrayList(list);
            this.f5615OooO0o = i;
            this.f5616OooO0o0 = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f5614OooO0Oo;
            int size = arrayList.size();
            int i = 0;
            if (this.f5615OooO0o != 1) {
                while (i < size) {
                    ((OooOO0) arrayList.get(i)).onFailed(this.f5616OooO0o0);
                    i++;
                }
            } else {
                while (i < size) {
                    ((OooOO0) arrayList.get(i)).onInitialized();
                    i++;
                }
            }
        }
    }

    public static abstract class OooOOO {
        public abstract void OooO00o(@Nullable Throwable th);

        public abstract void OooO0O0(@NonNull o0OoOo0 o0oooo1);
    }

    public interface OooOOO0 {
        void OooO00o(@NonNull OooOOO oooOOO);
    }

    public interface OooOOOO {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ReplaceStrategy {
    }

    public EmojiCompat(@NonNull EmojiCompatInitializer.OooO00o oooO00o) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f5600OooO00o = reentrantReadWriteLock;
        this.f5602OooO0OO = 3;
        OooOOO0 oooOOO0 = oooO00o.f5611OooO00o;
        this.f5604OooO0o = oooOOO0;
        int i = oooO00o.f5612OooO0O0;
        this.f5607OooO0oo = i;
        this.f5599OooO = oooO00o.f5613OooO0OO;
        this.f5603OooO0Oo = new Handler(Looper.getMainLooper());
        this.f5601OooO0O0 = new p190o00o0O.OooOO0O();
        this.f5606OooO0oO = new OooO0o();
        OooO00o oooO00o2 = new OooO00o(this);
        this.f5605OooO0o0 = oooO00o2;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f5602OooO0OO = 0;
            } catch (Throwable th) {
                this.f5600OooO00o.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (OooO0O0() == 0) {
            try {
                oooOOO0.OooO00o(new androidx.emoji2.text.OooOO0(oooO00o2));
            } catch (Throwable th2) {
                OooO0o0(th2);
            }
        }
    }

    @NonNull
    public static EmojiCompat OooO00o() {
        EmojiCompat emojiCompat;
        synchronized (f5597OooOO0) {
            emojiCompat = f5598OooOO0O;
            o000OO.OooOOO0.OooO0o("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", emojiCompat != null);
        }
        return emojiCompat;
    }

    public static boolean OooO0OO() {
        return f5598OooOO0O != null;
    }

    public final void OooO(@NonNull OooOO0 oooOO1) {
        o000OO.OooOOO0.OooO0o0(oooOO1, "initCallback cannot be null");
        this.f5600OooO00o.writeLock().lock();
        try {
            if (this.f5602OooO0OO == 1 || this.f5602OooO0OO == 2) {
                this.f5603OooO0Oo.post(new OooOO0O(Arrays.asList(oooOO1), this.f5602OooO0OO, null));
            } else {
                this.f5601OooO0O0.add(oooOO1);
            }
        } finally {
            this.f5600OooO00o.writeLock().unlock();
        }
    }

    public final int OooO0O0() {
        this.f5600OooO00o.readLock().lock();
        try {
            return this.f5602OooO0OO;
        } finally {
            this.f5600OooO00o.readLock().unlock();
        }
    }

    public final void OooO0Oo() {
        o000OO.OooOOO0.OooO0o("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.f5607OooO0oo == 1);
        if (OooO0O0() == 1) {
            return;
        }
        this.f5600OooO00o.writeLock().lock();
        try {
            if (this.f5602OooO0OO == 0) {
                this.f5600OooO00o.writeLock().unlock();
                return;
            }
            this.f5602OooO0OO = 0;
            this.f5600OooO00o.writeLock().unlock();
            OooO00o oooO00o = this.f5605OooO0o0;
            EmojiCompat emojiCompat = oooO00o.f5610OooO00o;
            try {
                emojiCompat.f5604OooO0o.OooO00o(new androidx.emoji2.text.OooOO0(oooO00o));
            } catch (Throwable th) {
                emojiCompat.OooO0o0(th);
            }
        } catch (Throwable th2) {
            this.f5600OooO00o.writeLock().unlock();
            throw th2;
        }
    }

    public final void OooO0o() {
        ArrayList arrayList = new ArrayList();
        this.f5600OooO00o.writeLock().lock();
        try {
            this.f5602OooO0OO = 1;
            arrayList.addAll(this.f5601OooO0O0);
            this.f5601OooO0O0.clear();
            this.f5600OooO00o.writeLock().unlock();
            this.f5603OooO0Oo.post(new OooOO0O(arrayList, this.f5602OooO0OO, null));
        } catch (Throwable th) {
            this.f5600OooO00o.writeLock().unlock();
            throw th;
        }
    }

    public final void OooO0o0(@Nullable Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f5600OooO00o.writeLock().lock();
        try {
            this.f5602OooO0OO = 2;
            arrayList.addAll(this.f5601OooO0O0);
            this.f5601OooO0O0.clear();
            this.f5600OooO00o.writeLock().unlock();
            this.f5603OooO0Oo.post(new OooOO0O(arrayList, this.f5602OooO0OO, th));
        } catch (Throwable th2) {
            this.f5600OooO00o.writeLock().unlock();
            throw th2;
        }
    }

    @Nullable
    @CheckResult
    public final CharSequence OooO0oO(@IntRange(from = ULong.MIN_VALUE) int i, @IntRange(from = ULong.MIN_VALUE) int i2, @Nullable CharSequence charSequence) {
        OooOo[] oooOoArr;
        o000OO.OooOOO0.OooO0o("Not initialized yet", OooO0O0() == 1);
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        o000OO.OooOOO0.OooO0O0(i <= i2, "start should be <= than end");
        o00oO0o o00oo0o2 = null;
        if (charSequence == null) {
            return null;
        }
        o000OO.OooOOO0.OooO0O0(i <= charSequence.length(), "start should be < than charSequence length");
        o000OO.OooOOO0.OooO0O0(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        OooOo00 oooOo00 = this.f5605OooO0o0.f5608OooO0O0;
        oooOo00.getClass();
        boolean z = charSequence instanceof o00O0O;
        if (z) {
            ((o00O0O) charSequence).OooO00o();
        }
        if (z) {
            o00oo0o2 = new o00oO0o((Spannable) charSequence);
        } else {
            try {
                if (charSequence instanceof Spannable) {
                    o00oo0o2 = new o00oO0o((Spannable) charSequence);
                } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, OooOo.class) <= i2) {
                    o00oo0o2 = new o00oO0o(charSequence);
                }
            } finally {
                if (z) {
                    ((o00O0O) charSequence).OooO0O0();
                }
            }
        }
        if (o00oo0o2 != null && (oooOoArr = (OooOo[]) o00oo0o2.getSpans(i, i2, OooOo.class)) != null && oooOoArr.length > 0) {
            for (OooOo oooOo : oooOoArr) {
                int spanStart = o00oo0o2.getSpanStart(oooOo);
                int spanEnd = o00oo0o2.getSpanEnd(oooOo);
                if (spanStart != i2) {
                    o00oo0o2.removeSpan(oooOo);
                }
                i = Math.min(spanStart, i);
                i2 = Math.max(spanEnd, i2);
            }
        }
        int i3 = i;
        int i4 = i2;
        if (i3 != i4 && i3 < charSequence.length()) {
            o00oO0o o00oo0o3 = (o00oO0o) oooOo00.OooO0OO(charSequence, i3, i4, Integer.MAX_VALUE, false, new OooOo00.OooO00o(o00oo0o2, oooOo00.f5633OooO00o));
            if (o00oo0o3 != null) {
                return o00oo0o3.f5672OooO0o0;
            }
            if (!z) {
                return charSequence;
            }
        } else if (!z) {
            return charSequence;
        }
        return charSequence;
    }

    @Nullable
    @CheckResult
    public final CharSequence OooO0oo(@Nullable CharSequence charSequence) {
        return OooO0oO(0, charSequence == null ? 0 : charSequence.length(), charSequence);
    }

    public final void OooOO0(@NonNull EditorInfo editorInfo) {
        if (!(OooO0O0() == 1) || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        OooO00o oooO00o = this.f5605OooO0o0;
        oooO00o.getClass();
        Bundle bundle = editorInfo.extras;
        p060o0000o0.o00O0O o00o0o2 = oooO00o.f5609OooO0OO.f5673OooO00o;
        int iOooO00o = o00o0o2.OooO00o(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iOooO00o != 0 ? o00o0o2.f33748OooO0O0.getInt(iOooO00o + o00o0o2.f33747OooO00o) : 0);
        Bundle bundle2 = editorInfo.extras;
        oooO00o.f5610OooO00o.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
