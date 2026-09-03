package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/input/AndroidTextInputServicePlugin;", "Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "Landroidx/compose/ui/text/input/AndroidTextInputServicePlugin$Adapter;", "()V", "createAdapter", "platformTextInput", "Landroidx/compose/ui/text/input/PlatformTextInput;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "Adapter", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidTextInputServicePlugin implements PlatformTextInputPlugin<Adapter> {

    @NotNull
    public static final AndroidTextInputServicePlugin INSTANCE = new AndroidTextInputServicePlugin();

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/input/AndroidTextInputServicePlugin$Adapter;", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "service", "Landroidx/compose/ui/text/input/TextInputService;", "androidService", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextInputServiceAndroid;)V", "getService", "()Landroidx/compose/ui/text/input/TextInputService;", "createInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Adapter implements PlatformTextInputAdapter {
        public static final int $stable = 8;

        @NotNull
        private final TextInputServiceAndroid androidService;

        @NotNull
        private final TextInputService service;

        public Adapter(@NotNull TextInputService service, @NotNull TextInputServiceAndroid androidService) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(androidService, "androidService");
            this.service = service;
            this.androidService = androidService;
        }

        @Override // androidx.compose.ui.text.input.PlatformTextInputAdapter
        @NotNull
        public InputConnection createInputConnection(@NotNull EditorInfo outAttrs) {
            Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
            return this.androidService.createInputConnection(outAttrs);
        }

        @NotNull
        public final TextInputService getService() {
            return this.service;
        }

        @Override // androidx.compose.ui.text.input.PlatformTextInputAdapter
        public final /* synthetic */ void onDisposed() {
            OooO00o.OooO00o(this);
        }
    }

    private AndroidTextInputServicePlugin() {
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputPlugin
    @NotNull
    public Adapter createAdapter(@NotNull PlatformTextInput platformTextInput, @NotNull View view) {
        Intrinsics.checkNotNullParameter(platformTextInput, "platformTextInput");
        Intrinsics.checkNotNullParameter(view, "view");
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(view, platformTextInput);
        return new Adapter(new TextInputService(textInputServiceAndroid), textInputServiceAndroid);
    }
}
