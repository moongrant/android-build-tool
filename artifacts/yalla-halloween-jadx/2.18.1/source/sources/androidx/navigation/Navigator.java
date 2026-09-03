package androidx.navigation;

import androidx.navigation.NavDestination;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o00000;
import p086o000OooO.o0000O00;

/* JADX INFO: loaded from: classes.dex */
public abstract class Navigator<D extends NavDestination> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public o0000O00 f8644OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f8645OooO0O0;

    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/Navigator$Name;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "()Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.RUNTIME)
    @kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
    public @interface Name {
        String value();
    }

    public interface OooO00o {
    }

    public static final class OooO0O0 extends Lambda implements Function1<NavBackStackEntry, NavBackStackEntry> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Navigator<D> f8646Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00000 f8647Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ OooO00o f8648Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Navigator<D> navigator, o00000 o00000Var, OooO00o oooO00o) {
            super(1);
            this.f8646Oooo0o = navigator;
            this.f8647Oooo0oO = o00000Var;
            this.f8648Oooo0oo = oooO00o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final NavBackStackEntry invoke(NavBackStackEntry navBackStackEntry) {
            NavBackStackEntry backStackEntry = navBackStackEntry;
            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
            NavDestination destination = backStackEntry.getDestination();
            if (!(destination instanceof NavDestination)) {
                destination = null;
            }
            if (destination == null) {
                return null;
            }
            Navigator<D> navigator = this.f8646Oooo0o;
            backStackEntry.getArguments();
            NavDestination navDestinationOooO0OO = navigator.OooO0OO(destination);
            if (navDestinationOooO0OO == null) {
                backStackEntry = null;
            } else if (!Intrinsics.areEqual(navDestinationOooO0OO, destination)) {
                backStackEntry = this.f8646Oooo0o.OooO0O0().OooO00o(navDestinationOooO0OO, navDestinationOooO0OO.OooO0O0(backStackEntry.getArguments()));
            }
            return backStackEntry;
        }
    }

    @NotNull
    public abstract D OooO00o();

    @NotNull
    public final o0000O00 OooO0O0() {
        o0000O00 o0000o00 = this.f8644OooO00o;
        if (o0000o00 != null) {
            return o0000o00;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    @Nullable
    public NavDestination OooO0OO(@NotNull NavDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }

    public void OooO0Oo(@NotNull List<NavBackStackEntry> entries, @Nullable o00000 o00000Var, @Nullable OooO00o oooO00o) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = SequencesKt.filterNotNull(SequencesKt.map(CollectionsKt.asSequence(entries), new OooO0O0(this, o00000Var, oooO00o))).iterator();
        while (it.hasNext()) {
            OooO0O0().OooO0o0((NavBackStackEntry) it.next());
        }
    }

    public boolean OooO0o() {
        return true;
    }

    public void OooO0o0(@NotNull NavBackStackEntry popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        List<NavBackStackEntry> value = OooO0O0().f28438OooO0o0.getValue();
        if (!value.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + value).toString());
        }
        ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
        NavBackStackEntry navBackStackEntryPrevious = null;
        while (OooO0o()) {
            navBackStackEntryPrevious = listIterator.previous();
            if (Intrinsics.areEqual(navBackStackEntryPrevious, popUpTo)) {
                break;
            }
        }
        if (navBackStackEntryPrevious != null) {
            OooO0O0().OooO0OO(navBackStackEntryPrevious, z);
        }
    }
}
