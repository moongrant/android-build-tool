package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import o0O0O00.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Navigator.Name("activity")
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/OooO00o;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/OooO00o$OooO00o;", "OooO00o", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0})
public class OooO00o extends Navigator<C0059OooO00o> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Activity f8649OooO0OO;

    /* JADX INFO: renamed from: androidx.navigation.OooO00o$OooO00o, reason: collision with other inner class name */
    @NavDestination.ClassType(Activity.class)
    public static class C0059OooO00o extends NavDestination {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0059OooO00o(@NotNull Navigator<? extends C0059OooO00o> activityNavigator) {
            super(activityNavigator);
            Intrinsics.checkNotNullParameter(activityNavigator, "activityNavigator");
        }

        @Override // androidx.navigation.NavDestination
        public final boolean equals(@Nullable Object obj) {
            if (obj == null || !(obj instanceof C0059OooO00o) || !super.equals(obj)) {
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f8650Oooo0o = new OooO0O0();

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
        for (Object obj : SequencesKt.generateSequence(context, OooO0O0.f8650Oooo0o)) {
            if (((Context) obj) instanceof Activity) {
                this.f8649OooO0OO = (Activity) obj;
            }
        }
        obj = null;
        this.f8649OooO0OO = (Activity) obj;
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination OooO00o() {
        return new C0059OooO00o(this);
    }

    @Override // androidx.navigation.Navigator
    public final NavDestination OooO0OO(NavDestination navDestination) {
        C0059OooO00o destination = (C0059OooO00o) navDestination;
        Intrinsics.checkNotNullParameter(destination, "destination");
        StringBuilder sb = new StringBuilder();
        sb.append("Destination ");
        throw new IllegalStateException(o0ooOOo.OooO00o(sb, destination.f8637OoooO0O, " does not have an Intent set.").toString());
    }

    @Override // androidx.navigation.Navigator
    public final boolean OooO0o() {
        Activity activity = this.f8649OooO0OO;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
