package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.facebook.share.internal.ShareConstants;
import com.umeng.analytics.pro.d;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o00000OO;
import p094o000o0OO.o00O0O;
import p094o000o0OO.o00Oo0;
import p094o000o0OO.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003STUBS\b\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010L\u0012\b\b\u0002\u0010-\u001a\u00020,\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bN\u0010OB\u001d\b\u0017\u0012\u0006\u0010P\u001a\u00020\u0000\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\bN\u0010QJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0019\u0010%\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0016\u00101\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010&R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010@R*\u0010C\u001a\u00020)2\u0006\u0010B\u001a\u00020)8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010+\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006V"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Lo000o0OO/o00Oo0;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "handleLifecycleEvent", "updateState", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "Landroid/os/Bundle;", "outBundle", "saveState", "", "other", "", "equals", "", "hashCode", "Landroid/content/Context;", d.R, "Landroid/content/Context;", "Landroidx/navigation/NavDestination;", ShareConstants.DESTINATION, "Landroidx/navigation/NavDestination;", "getDestination", "()Landroidx/navigation/NavDestination;", "setDestination", "(Landroidx/navigation/NavDestination;)V", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "savedState", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycle", "Landroidx/lifecycle/LifecycleRegistry;", "savedStateRegistryAttached", "Z", "Landroidx/lifecycle/SavedStateViewModelFactory;", "defaultFactory$delegate", "Lkotlin/Lazy;", "getDefaultFactory", "()Landroidx/lifecycle/SavedStateViewModelFactory;", "defaultFactory", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle$delegate", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "maxState", "maxLifecycle", "getMaxLifecycle", "()Landroidx/lifecycle/Lifecycle$State;", "setMaxLifecycle", "(Landroidx/lifecycle/Lifecycle$State;)V", "Lo000o0OO/o0OoOo0;", "getSavedStateRegistry", "()Lo000o0OO/o0OoOo0;", "savedStateRegistry", "Lo000OooO/o00000OO;", "viewModelStoreProvider", "<init>", "(Landroid/content/Context;Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Lo000OooO/o00000OO;Ljava/lang/String;Landroid/os/Bundle;)V", "entry", "(Landroidx/navigation/NavBackStackEntry;Landroid/os/Bundle;)V", "Companion", "OooO00o", "OooO0O0", "OooO0OO", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, o00Oo0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final Bundle arguments;

    @Nullable
    private final Context context;

    /* JADX INFO: renamed from: defaultFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy defaultFactory;

    @NotNull
    private NavDestination destination;

    @NotNull
    private Lifecycle.State hostLifecycleState;

    @NotNull
    private final String id;

    @NotNull
    private LifecycleRegistry lifecycle;

    @NotNull
    private Lifecycle.State maxLifecycle;

    @Nullable
    private final Bundle savedState;

    /* JADX INFO: renamed from: savedStateHandle$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy savedStateHandle;
    private boolean savedStateRegistryAttached;

    @NotNull
    private final o00O0O savedStateRegistryController;

    @Nullable
    private final o00000OO viewModelStoreProvider;

    public static final class OooO extends Lambda implements Function0<SavedStateHandle> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SavedStateHandle invoke() {
            if (!NavBackStackEntry.this.savedStateRegistryAttached) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
            }
            if (!(NavBackStackEntry.this.lifecycle.getCurrentState() != Lifecycle.State.DESTROYED)) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
            }
            NavBackStackEntry navBackStackEntry = NavBackStackEntry.this;
            return ((OooO0OO) new ViewModelProvider(navBackStackEntry, new OooO0O0(navBackStackEntry)).get(OooO0OO.class)).f8623OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavBackStackEntry$OooO00o, reason: from kotlin metadata */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Companion {
        public static /* synthetic */ NavBackStackEntry OooO0O0(Companion companion, Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, o00000OO o00000oo2) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            return companion.OooO00o(context, navDestination, bundle, state, o00000oo2, string, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @NotNull
        public final NavBackStackEntry OooO00o(@Nullable Context context, @NotNull NavDestination destination, @Nullable Bundle bundle, @NotNull Lifecycle.State hostLifecycleState, @Nullable o00000OO o00000oo2, @NotNull String id, @Nullable Bundle bundle2) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
            Intrinsics.checkNotNullParameter(id, "id");
            return new NavBackStackEntry(context, destination, bundle, hostLifecycleState, o00000oo2, id, bundle2, null);
        }
    }

    public static final class OooO0O0 extends AbstractSavedStateViewModelFactory {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(@NotNull o00Oo0 owner) {
            super(owner, null);
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
        @NotNull
        public final <T extends ViewModel> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull SavedStateHandle handle) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(handle, "handle");
            return new OooO0OO(handle);
        }
    }

    public static final class OooO0OO extends ViewModel {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final SavedStateHandle f8623OooO00o;

        public OooO0OO(@NotNull SavedStateHandle handle) {
            Intrinsics.checkNotNullParameter(handle, "handle");
            this.f8623OooO00o = handle;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<SavedStateViewModelFactory> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SavedStateViewModelFactory invoke() {
            Context context = NavBackStackEntry.this.context;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            NavBackStackEntry navBackStackEntry = NavBackStackEntry.this;
            return new SavedStateViewModelFactory(application, navBackStackEntry, navBackStackEntry.getArguments());
        }
    }

    private NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, o00000OO o00000oo2, String str, Bundle bundle2) {
        this.context = context;
        this.destination = navDestination;
        this.arguments = bundle;
        this.hostLifecycleState = state;
        this.viewModelStoreProvider = o00000oo2;
        this.id = str;
        this.savedState = bundle2;
        this.lifecycle = new LifecycleRegistry(this);
        Intrinsics.checkNotNullParameter(this, "owner");
        this.savedStateRegistryController = new o00O0O(this);
        this.defaultFactory = LazyKt.lazy(new OooO0o());
        this.savedStateHandle = LazyKt.lazy(new OooO());
        this.maxLifecycle = Lifecycle.State.INITIALIZED;
    }

    public /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, o00000OO o00000oo2, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, navDestination, bundle, state, o00000oo2, str, bundle2);
    }

    private final SavedStateViewModelFactory getDefaultFactory() {
        return (SavedStateViewModelFactory) this.defaultFactory.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    public boolean equals(@Nullable Object other) {
        boolean z;
        Set<String> setKeySet;
        boolean z2;
        if (other == null || !(other instanceof NavBackStackEntry)) {
            return false;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) other;
        if (!Intrinsics.areEqual(this.id, navBackStackEntry.id) || !Intrinsics.areEqual(this.destination, navBackStackEntry.destination) || !Intrinsics.areEqual(this.lifecycle, navBackStackEntry.lifecycle) || !Intrinsics.areEqual(getSavedStateRegistry(), navBackStackEntry.getSavedStateRegistry())) {
            return false;
        }
        if (!Intrinsics.areEqual(this.arguments, navBackStackEntry.arguments)) {
            Bundle bundle = this.arguments;
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                z = false;
            } else {
                if (!setKeySet.isEmpty()) {
                    Iterator<T> it = setKeySet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = true;
                            break;
                        }
                        String str = (String) it.next();
                        Object obj = this.arguments.get(str);
                        Bundle bundle2 = navBackStackEntry.arguments;
                        if (!Intrinsics.areEqual(obj, bundle2 != null ? bundle2.get(str) : null)) {
                            z2 = false;
                            break;
                        }
                    }
                } else {
                    z2 = true;
                    break;
                }
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final Bundle getArguments() {
        return this.arguments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NotNull
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        Context context = this.context;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, bundle);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NotNull
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return getDefaultFactory();
    }

    @NotNull
    public final NavDestination getDestination() {
        return this.destination;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Lifecycle.State getMaxLifecycle() {
        return this.maxLifecycle;
    }

    @NotNull
    public final SavedStateHandle getSavedStateHandle() {
        return (SavedStateHandle) this.savedStateHandle.getValue();
    }

    @Override // p094o000o0OO.o00Oo0
    @NotNull
    public o0OoOo0 getSavedStateRegistry() {
        return this.savedStateRegistryController.f29285OooO0O0;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NotNull
    public ViewModelStore getViewModelStore() {
        if (!this.savedStateRegistryAttached) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (!(this.lifecycle.getCurrentState() != Lifecycle.State.DESTROYED)) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        o00000OO o00000oo2 = this.viewModelStoreProvider;
        if (o00000oo2 != null) {
            return o00000oo2.OooO00o(this.id);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void handleLifecycleEvent(@NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Lifecycle.State targetState = event.getTargetState();
        Intrinsics.checkNotNullExpressionValue(targetState, "event.targetState");
        this.hostLifecycleState = targetState;
        updateState();
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.destination.hashCode() + (this.id.hashCode() * 31);
        Bundle bundle = this.arguments;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = this.arguments.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.lifecycle.hashCode() + (iHashCode * 31)) * 31);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void saveState(@NotNull Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.savedStateRegistryController.OooO0Oo(outBundle);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setDestination(@NotNull NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "<set-?>");
        this.destination = navDestination;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setMaxLifecycle(@NotNull Lifecycle.State maxState) {
        Intrinsics.checkNotNullParameter(maxState, "maxState");
        this.maxLifecycle = maxState;
        updateState();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void updateState() {
        if (!this.savedStateRegistryAttached) {
            this.savedStateRegistryController.OooO0O0();
            this.savedStateRegistryAttached = true;
            if (this.viewModelStoreProvider != null) {
                SavedStateHandleSupport.enableSavedStateHandles(this);
            }
            this.savedStateRegistryController.OooO0OO(this.savedState);
        }
        if (this.hostLifecycleState.ordinal() < this.maxLifecycle.ordinal()) {
            this.lifecycle.setCurrentState(this.hostLifecycleState);
        } else {
            this.lifecycle.setCurrentState(this.maxLifecycle);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, o00000OO o00000oo2, String str, Bundle bundle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str2;
        Bundle bundle3 = (i & 4) != 0 ? null : bundle;
        Lifecycle.State state2 = (i & 8) != 0 ? Lifecycle.State.CREATED : state;
        o00000OO o00000oo3 = (i & 16) != 0 ? null : o00000oo2;
        if ((i & 32) != 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            str2 = string;
        } else {
            str2 = str;
        }
        this(context, navDestination, bundle3, state2, o00000oo3, str2, (i & 64) != 0 ? null : bundle2);
    }

    public /* synthetic */ NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(navBackStackEntry, (i & 2) != 0 ? navBackStackEntry.arguments : bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavBackStackEntry(@NotNull NavBackStackEntry entry, @Nullable Bundle bundle) {
        this(entry.context, entry.destination, bundle, entry.hostLifecycleState, entry.viewModelStoreProvider, entry.id, entry.savedState);
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.hostLifecycleState = entry.hostLifecycleState;
        setMaxLifecycle(entry.maxLifecycle);
    }
}
