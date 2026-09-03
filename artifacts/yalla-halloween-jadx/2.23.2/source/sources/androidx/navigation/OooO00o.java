package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Navigator.Name("activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/OooO00o;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/OooO00o$OooO00o;", "OooO00o", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,530:1\n179#2,2:531\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n*L\n48#1:531,2\n*E\n"})
public class OooO00o extends Navigator<C0162OooO00o> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Activity f9936OooO0OO;

    /* JADX INFO: renamed from: androidx.navigation.OooO00o$OooO00o, reason: collision with other inner class name */
    @NavDestination.ClassType(Activity.class)
    @SourceDebugExtension({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,530:1\n232#2,3:531\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n*L\n270#1:531,3\n*E\n"})
    public static class C0162OooO00o extends NavDestination {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0162OooO00o(@NotNull Navigator<? extends C0162OooO00o> activityNavigator) {
            super(activityNavigator);
            Intrinsics.checkNotNullParameter(activityNavigator, "activityNavigator");
        }

        @Override // androidx.navigation.NavDestination
        public final boolean equals(@Nullable Object obj) {
            if (obj == null || !(obj instanceof C0162OooO00o) || !super.equals(obj)) {
                return false;
            }
            return Intrinsics.areEqual((Object) null, (Object) null);
        }

        @Override // androidx.navigation.NavDestination
        public final int hashCode() {
            return (((super.hashCode() * 31) + 0) * 31) + 0;
        }

        @Override // androidx.navigation.NavDestination
        @NotNull
        public final String toString() {
            String str = super.toString();
            Intrinsics.checkNotNullExpressionValue(str, "sb.toString()");
            return str;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Context, Context> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f9937OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Context invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public OooO00o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        for (Object obj : SequencesKt.generateSequence(context, OooO0O0.f9937OooO0Oo)) {
            if (((Context) obj) instanceof Activity) {
                this.f9936OooO0OO = (Activity) obj;
            }
        }
        obj = null;
        this.f9936OooO0OO = (Activity) obj;
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination OooO00o() {
        return new C0162OooO00o(this);
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination OooO0OO(NavDestination navDestination) {
        C0162OooO00o destination = (C0162OooO00o) navDestination;
        Intrinsics.checkNotNullParameter(destination, "destination");
        throw new IllegalStateException(p022Oooo00O.OooOO0.OooO00o(new StringBuilder("Destination "), destination.f9915OooOO0, " does not have an Intent set.").toString());
    }

    @Override // androidx.navigation.Navigator
    public final boolean OooO0o() {
        Activity activity = this.f9936OooO0OO;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
