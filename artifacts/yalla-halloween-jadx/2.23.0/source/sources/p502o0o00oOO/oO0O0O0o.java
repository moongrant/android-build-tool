package p502o0o00oOO;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.yalla.yalla.app.golbalData.ApiRoomShareUtils;
import com.yalla.yalla.model.share.ShareContentModel;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareUrlModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.view.pop.roomSharePop.RoomShareModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p571o0oOoOO.o0O0o000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomChatMemberShareTaskRoomVH.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatMemberShareTaskRoomVH.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatMemberShareTaskRoomVH$setData$2$1\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,64:1\n75#2,13:65\n*S KotlinDebug\n*F\n+ 1 RoomChatMemberShareTaskRoomVH.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatMemberShareTaskRoomVH$setData$2$1\n*L\n44#1:65,13\n*E\n"})
public final class oO0O0O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOo0o0oO f49577OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0O0o(oOo0o0oO ooo0o0oo) {
        super(0);
        this.f49577OooO0Oo = ooo0o0oo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final FragmentActivity fragmentActivity = this.f49577OooO0Oo.f49471OooO00o;
        ViewModelLazy viewModelLazy = new ViewModelLazy(Reflection.getOrCreateKotlinClass(o0O0o000.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.adapter.roomChat.RoomChatMemberShareTaskRoomVH$setData$2$1$invoke$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = fragmentActivity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.adapter.roomChat.RoomChatMemberShareTaskRoomVH$setData$2$1$invoke$$inlined$viewModels$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = fragmentActivity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.adapter.roomChat.RoomChatMemberShareTaskRoomVH$setData$2$1$invoke$$inlined$viewModels$default$3

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f27718OooO0Oo = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27718OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = fragmentActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        o0O0o000 o0o0o000 = (o0O0o000) viewModelLazy.getValue();
        ShareContentModel shareContentModel = new ShareContentModel(ShareContentType.Room);
        OooO0O0.OooO00o oooO00o = OooO0O0.f24995OoooOOO;
        String value = oooO00o.OooO00o().f24999OooO0O0.getValue();
        String value2 = OooO00o.f24978OooO0o0.f47490OooO0o.getValue();
        ApiRoomShareUtils.f22714OooO00o.getClass();
        ShareUrlModel shareUrlModelOooO00o = ApiRoomShareUtils.OooO00o();
        String shareUrl = shareUrlModelOooO00o != null ? shareUrlModelOooO00o.getShareUrl() : null;
        if (shareUrl == null) {
            shareUrl = "https://www.yalla.live/";
        } else {
            Intrinsics.checkNotNullExpressionValue(shareUrl, "ApiRoomShareUtils.shareU…reUrl ?: AppUrl.YallaLive");
        }
        shareContentModel.setRoom(new RoomShareModel(value, value2, shareUrl, oooO00o.OooO00o().f24998OooO00o.getValue(), String.valueOf(oooO00o.OooO00o().f25001OooO0Oo.getValue()), String.valueOf(oooO00o.OooO00o().f25000OooO0OO.getValue()), 1));
        o0o0o000.f56248OooO0O0.setValue(shareContentModel);
        ((o0O0o000) viewModelLazy.getValue()).f56247OooO00o.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
