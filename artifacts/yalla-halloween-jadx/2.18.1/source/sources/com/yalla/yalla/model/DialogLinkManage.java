package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/DialogLinkManage;", "", "()V", "joinRoomDialogFromGiftSendDialogLink", "Lcom/yalla/yalla/model/DialogLinkItem;", "getJoinRoomDialogFromGiftSendDialogLink", "()Lcom/yalla/yalla/model/DialogLinkItem;", "joinRoomDialogFromGiftSendDialogLink$delegate", "Lkotlin/Lazy;", "quickRechargeDialogFromGiftSendDialog", "getQuickRechargeDialogFromGiftSendDialog", "quickRechargeDialogFromGiftSendDialog$delegate", "receiveCrystalDialogFromGiftSendDialog", "getReceiveCrystalDialogFromGiftSendDialog", "receiveCrystalDialogFromGiftSendDialog$delegate", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DialogLinkManage {

    @NotNull
    public static final DialogLinkManage INSTANCE = new DialogLinkManage();

    /* JADX INFO: renamed from: joinRoomDialogFromGiftSendDialogLink$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy joinRoomDialogFromGiftSendDialogLink = LazyKt.lazy(new Function0<DialogLinkItem>() { // from class: com.yalla.yalla.model.DialogLinkManage$joinRoomDialogFromGiftSendDialogLink$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final DialogLinkItem invoke() {
            return new DialogLinkItem();
        }
    });

    /* JADX INFO: renamed from: quickRechargeDialogFromGiftSendDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy quickRechargeDialogFromGiftSendDialog = LazyKt.lazy(new Function0<DialogLinkItem>() { // from class: com.yalla.yalla.model.DialogLinkManage$quickRechargeDialogFromGiftSendDialog$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final DialogLinkItem invoke() {
            return new DialogLinkItem();
        }
    });

    /* JADX INFO: renamed from: receiveCrystalDialogFromGiftSendDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy receiveCrystalDialogFromGiftSendDialog = LazyKt.lazy(new Function0<DialogLinkItem>() { // from class: com.yalla.yalla.model.DialogLinkManage$receiveCrystalDialogFromGiftSendDialog$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final DialogLinkItem invoke() {
            return new DialogLinkItem();
        }
    });
    public static final int $stable = 8;

    private DialogLinkManage() {
    }

    @NotNull
    public final DialogLinkItem getJoinRoomDialogFromGiftSendDialogLink() {
        return (DialogLinkItem) joinRoomDialogFromGiftSendDialogLink.getValue();
    }

    @NotNull
    public final DialogLinkItem getQuickRechargeDialogFromGiftSendDialog() {
        return (DialogLinkItem) quickRechargeDialogFromGiftSendDialog.getValue();
    }

    @NotNull
    public final DialogLinkItem getReceiveCrystalDialogFromGiftSendDialog() {
        return (DialogLinkItem) receiveCrystalDialogFromGiftSendDialog.getValue();
    }
}
