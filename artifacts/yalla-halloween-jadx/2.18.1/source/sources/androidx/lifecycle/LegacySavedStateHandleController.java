package androidx.lifecycle;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Iterator;
import p094o000o0OO.o00Oo0;
import p094o000o0OO.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
class LegacySavedStateHandleController {
    public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    public static final class OnRecreation implements o0OoOo0.OooO00o {
        @Override // o000o0OO.o0OoOo0.OooO00o
        public void onRecreated(@NonNull o00Oo0 o00oo1) {
            if (!(o00oo1 instanceof ViewModelStoreOwner)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            ViewModelStore viewModelStore = ((ViewModelStoreOwner) o00oo1).getViewModelStore();
            o0OoOo0 savedStateRegistry = o00oo1.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.keys().iterator();
            while (it.hasNext()) {
                LegacySavedStateHandleController.attachHandleIfNeeded(viewModelStore.get(it.next()), savedStateRegistry, o00oo1.getLifecycle());
            }
            if (viewModelStore.keys().isEmpty()) {
                return;
            }
            savedStateRegistry.OooO0Oo(OnRecreation.class);
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static void attachHandleIfNeeded(ViewModel viewModel, o0OoOo0 o0oooo1, Lifecycle lifecycle) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.isAttached()) {
            return;
        }
        savedStateHandleController.attachToLifecycle(o0oooo1, lifecycle);
        tryToAddRecreator(o0oooo1, lifecycle);
    }

    public static SavedStateHandleController create(o0OoOo0 o0oooo1, Lifecycle lifecycle, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, SavedStateHandle.createHandle(o0oooo1.OooO00o(str), bundle));
        savedStateHandleController.attachToLifecycle(o0oooo1, lifecycle);
        tryToAddRecreator(o0oooo1, lifecycle);
        return savedStateHandleController;
    }

    private static void tryToAddRecreator(final o0OoOo0 o0oooo1, final Lifecycle lifecycle) {
        Lifecycle.State currentState = lifecycle.getCurrentState();
        if (currentState == Lifecycle.State.INITIALIZED || currentState.isAtLeast(Lifecycle.State.STARTED)) {
            o0oooo1.OooO0Oo(OnRecreation.class);
        } else {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.lifecycle.LegacySavedStateHandleController.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_START) {
                        lifecycle.removeObserver(this);
                        o0oooo1.OooO0Oo(OnRecreation.class);
                    }
                }
            });
        }
    }
}
