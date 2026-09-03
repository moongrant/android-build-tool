package p510o0o00oo0;

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
import p577o0oOoOOO.i;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomChatMemberShareTaskRoomVH.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatMemberShareTaskRoomVH.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatMemberShareTaskRoomVH$setData$2$1\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,64:1\n75#2,13:65\n*S KotlinDebug\n*F\n+ 1 RoomChatMemberShareTaskRoomVH.kt\ncom/yalla/yalla/ui/adapter/roomChat/RoomChatMemberShareTaskRoomVH$setData$2$1\n*L\n44#1:65,13\n*E\n"})
public final class oO0O0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0O0Oo0 f50766OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0O00(oO0O0Oo0 oo0o0oo0) {
        super(0);
        this.f50766OooO0Oo = oo0o0oo0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final FragmentActivity fragmentActivity = this.f50766OooO0Oo.f50645OooO00o;
        ViewModelLazy viewModelLazy = new ViewModelLazy(Reflection.getOrCreateKotlinClass(i.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.adapter.roomChat.RoomChatMemberShareTaskRoomVH$setData$2$1$invoke$$inlined$viewModels$default$2
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
            public final /* synthetic */ Function0 f27257OooO0Oo = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27257OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = fragmentActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
        i iVar = (i) viewModelLazy.getValue();
        ShareContentModel shareContentModel = new ShareContentModel(ShareContentType.Room);
        OooO0O0.OooO00o oooO00o = OooO0O0.f24541OoooOOO;
        String value = oooO00o.OooO00o().f24545OooO0O0.getValue();
        String value2 = OooO00o.f24524OooO0o0.f48426OooO0o.getValue();
        ApiRoomShareUtils.f22248OooO00o.getClass();
        ShareUrlModel shareUrlModelOooO00o = ApiRoomShareUtils.OooO00o();
        String shareUrl = shareUrlModelOooO00o != null ? shareUrlModelOooO00o.getShareUrl() : null;
        if (shareUrl == null) {
            shareUrl = "https://www.yalla.live/";
        } else {
            Intrinsics.checkNotNull(shareUrl);
        }
        shareContentModel.setRoom(new RoomShareModel(value, value2, shareUrl, oooO00o.OooO00o().f24544OooO00o.getValue(), String.valueOf(oooO00o.OooO00o().f24547OooO0Oo.getValue()), String.valueOf(oooO00o.OooO00o().f24546OooO0OO.getValue()), 1));
        iVar.f56407OooO0O0.setValue(shareContentModel);
        ((i) viewModelLazy.getValue()).f56406OooO00o.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
