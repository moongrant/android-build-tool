package p068o0000oo;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import o0000.OooO;
import o0000.OooO0o;
import o0000O00.OooOO0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public final class o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0000oo f27951OooO00o = new o0000oo();

    @DoNotInline
    @RequiresApi(24)
    @NotNull
    public final Object OooO00o(@NotNull OooO localeList) {
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(localeList, 10));
        Iterator<OooO0o> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(o0000O00.OooO00o(it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    @DoNotInline
    @RequiresApi(24)
    public final void OooO0O0(@NotNull OooOO0 textPaint, @NotNull OooO localeList) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(localeList, 10));
        Iterator<OooO0o> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(o0000O00.OooO00o(it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        textPaint.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
