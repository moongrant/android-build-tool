package com.app.base.protobuf;

import io.grpc.MethodDescriptor;
import io.grpc.OooO0O0;
import io.grpc.OooO0OO;
import io.grpc.OooO0o;
import io.grpc.o00O0O;
import io.grpc.o0OoOo0;
import io.grpc.stub.annotations.RpcMethod;
import java.util.Iterator;
import java.util.logging.Logger;
import p639o0ooO0Oo.o000OO0O;
import p641o0ooO0o0.o000O;
import p641o0ooO0o0.o000O0;
import p641o0ooO0o0.o000O0O0;
import p641o0ooO0o0.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class SlaveGrpc {
    private static final int METHODID_BAN_STATUS = 15;
    private static final int METHODID_CONFIRM = 2;
    private static final int METHODID_FRIEND_ADD = 7;
    private static final int METHODID_FRIEND_APPLY = 9;
    private static final int METHODID_FRIEND_BLOCK = 12;
    private static final int METHODID_FRIEND_CHECK = 11;
    private static final int METHODID_FRIEND_DELETE = 8;
    private static final int METHODID_FRIEND_UNBLOCK = 13;
    private static final int METHODID_GIF_EMOTICON = 6;
    private static final int METHODID_NOTIFY = 0;
    private static final int METHODID_RECEIVE = 1;
    private static final int METHODID_SAY = 3;
    private static final int METHODID_SEND_EMOTICON = 14;
    private static final int METHODID_SEND_GIFT = 4;
    private static final int METHODID_SEND_VOICE = 5;
    private static final int METHODID_SHARE_ROOM = 16;
    private static final int METHODID_USER_INFO = 10;
    public static final String SERVICE_NAME = "slave.Slave";
    private static volatile MethodDescriptor<MessageIM.BanStatusIn, MessageIM.BanStatusOut> getBanStatusMethod;
    private static volatile MethodDescriptor<MessageIM.ConfirmRequest, MessageEmpty.Empty> getConfirmMethod;
    private static volatile MethodDescriptor<MessageIM.FriendAddRequest, MessageIM.FriendAddReply> getFriendAddMethod;
    private static volatile MethodDescriptor<MessageIM.FriendApplyRequest, MessageEmpty.Empty> getFriendApplyMethod;
    private static volatile MethodDescriptor<MessageIM.FriendBlockRequest, MessageEmpty.Empty> getFriendBlockMethod;
    private static volatile MethodDescriptor<MessageIM.FriendCheckRequest, MessageIM.FriendCheckReply> getFriendCheckMethod;
    private static volatile MethodDescriptor<MessageIM.FriendDeleteRequest, MessageEmpty.Empty> getFriendDeleteMethod;
    private static volatile MethodDescriptor<MessageIM.FriendUnblockRequest, MessageEmpty.Empty> getFriendUnblockMethod;
    private static volatile MethodDescriptor<MessageIM.GifEmoticonIn, MessageEmpty.Empty> getGifEmoticonMethod;
    private static volatile MethodDescriptor<MessageIM.NotifyRequest, MessageIM.NotifyReply> getNotifyMethod;
    private static volatile MethodDescriptor<MessageIM.ReceiveRequest, MessageIM.ReceiveReply> getReceiveMethod;
    private static volatile MethodDescriptor<MessageIM.SayRequest, MessageIM.SayReply> getSayMethod;
    private static volatile MethodDescriptor<MessageIM.SendEmoticonRequest, MessageIM.SendEmoticonReply> getSendEmoticonMethod;
    private static volatile MethodDescriptor<MessageIM.SendGiftRequest, MessageIM.SendGiftReply> getSendGiftMethod;
    private static volatile MethodDescriptor<MessageIM.SendVoiceRequest, MessageIM.SendVoiceReply> getSendVoiceMethod;
    private static volatile MethodDescriptor<MessageIM.ShareRoomIn, MessageEmpty.Empty> getShareRoomMethod;
    private static volatile MethodDescriptor<MessageIM.UserInfoRequest, MessageIM.UserInfoReply> getUserInfoMethod;
    private static volatile o00O0O serviceDescriptor;

    public static final class SlaveBlockingStub extends o000O0<SlaveBlockingStub> {
        public MessageIM.BanStatusOut banStatus(MessageIM.BanStatusIn banStatusIn) {
            return (MessageIM.BanStatusOut) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getBanStatusMethod(), getCallOptions(), banStatusIn);
        }

        public MessageEmpty.Empty confirm(MessageIM.ConfirmRequest confirmRequest) {
            return (MessageEmpty.Empty) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getConfirmMethod(), getCallOptions(), confirmRequest);
        }

        public MessageIM.FriendAddReply friendAdd(MessageIM.FriendAddRequest friendAddRequest) {
            return (MessageIM.FriendAddReply) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getFriendAddMethod(), getCallOptions(), friendAddRequest);
        }

        public MessageEmpty.Empty friendApply(MessageIM.FriendApplyRequest friendApplyRequest) {
            return (MessageEmpty.Empty) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getFriendApplyMethod(), getCallOptions(), friendApplyRequest);
        }

        public MessageEmpty.Empty friendBlock(MessageIM.FriendBlockRequest friendBlockRequest) {
            return (MessageEmpty.Empty) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getFriendBlockMethod(), getCallOptions(), friendBlockRequest);
        }

        public MessageIM.FriendCheckReply friendCheck(MessageIM.FriendCheckRequest friendCheckRequest) {
            return (MessageIM.FriendCheckReply) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getFriendCheckMethod(), getCallOptions(), friendCheckRequest);
        }

        public MessageEmpty.Empty friendDelete(MessageIM.FriendDeleteRequest friendDeleteRequest) {
            return (MessageEmpty.Empty) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getFriendDeleteMethod(), getCallOptions(), friendDeleteRequest);
        }

        public MessageEmpty.Empty friendUnblock(MessageIM.FriendUnblockRequest friendUnblockRequest) {
            return (MessageEmpty.Empty) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getFriendUnblockMethod(), getCallOptions(), friendUnblockRequest);
        }

        public MessageEmpty.Empty gifEmoticon(MessageIM.GifEmoticonIn gifEmoticonIn) {
            return (MessageEmpty.Empty) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getGifEmoticonMethod(), getCallOptions(), gifEmoticonIn);
        }

        public Iterator<MessageIM.NotifyReply> notify(MessageIM.NotifyRequest notifyRequest) {
            OooO0OO channel = getChannel();
            MethodDescriptor<MessageIM.NotifyRequest, MessageIM.NotifyReply> notifyMethod = SlaveGrpc.getNotifyMethod();
            OooO0O0 callOptions = getCallOptions();
            Logger logger = o000O0Oo.f48881OooO00o;
            o000O0Oo.OooO0OO oooO0OO = new o000O0Oo.OooO0OO();
            OooO0o oooO0oOooO00o = channel.OooO00o(notifyMethod, callOptions.OooO00o(oooO0OO));
            o000O0Oo.OooO00o oooO00o = new o000O0Oo.OooO00o(oooO0oOooO00o, oooO0OO);
            o000O0Oo.OooO00o(oooO0oOooO00o);
            return oooO00o;
        }

        public MessageIM.ReceiveReply receive(MessageIM.ReceiveRequest receiveRequest) {
            return (MessageIM.ReceiveReply) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getReceiveMethod(), getCallOptions(), receiveRequest);
        }

        public MessageIM.SayReply say(MessageIM.SayRequest sayRequest) {
            return (MessageIM.SayReply) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getSayMethod(), getCallOptions(), sayRequest);
        }

        public MessageIM.SendEmoticonReply sendEmoticon(MessageIM.SendEmoticonRequest sendEmoticonRequest) {
            return (MessageIM.SendEmoticonReply) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getSendEmoticonMethod(), getCallOptions(), sendEmoticonRequest);
        }

        public MessageIM.SendGiftReply sendGift(MessageIM.SendGiftRequest sendGiftRequest) {
            return (MessageIM.SendGiftReply) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getSendGiftMethod(), getCallOptions(), sendGiftRequest);
        }

        public MessageIM.SendVoiceReply sendVoice(MessageIM.SendVoiceRequest sendVoiceRequest) {
            return (MessageIM.SendVoiceReply) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getSendVoiceMethod(), getCallOptions(), sendVoiceRequest);
        }

        public MessageEmpty.Empty shareRoom(MessageIM.ShareRoomIn shareRoomIn) {
            return (MessageEmpty.Empty) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getShareRoomMethod(), getCallOptions(), shareRoomIn);
        }

        public MessageIM.UserInfoReply userInfo(MessageIM.UserInfoRequest userInfoRequest) {
            return (MessageIM.UserInfoReply) o000O0Oo.OooO0OO(getChannel(), SlaveGrpc.getUserInfoMethod(), getCallOptions(), userInfoRequest);
        }

        private SlaveBlockingStub(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // p641o0ooO0o0.o000O0
        public SlaveBlockingStub build(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
            return new SlaveBlockingStub(oooO0OO, oooO0O0);
        }

        private SlaveBlockingStub(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
            super(oooO0OO, oooO0O0);
        }
    }

    public static final class SlaveFutureStub extends o000O0<SlaveFutureStub> {
        public com.google.common.util.concurrent.OooO0OO<MessageIM.BanStatusOut> banStatus(MessageIM.BanStatusIn banStatusIn) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getBanStatusMethod(), getCallOptions()));
        }

        public com.google.common.util.concurrent.OooO0OO<MessageEmpty.Empty> confirm(MessageIM.ConfirmRequest confirmRequest) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getConfirmMethod(), getCallOptions()));
        }

        public com.google.common.util.concurrent.OooO0OO<MessageIM.FriendAddReply> friendAdd(MessageIM.FriendAddRequest friendAddRequest) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getFriendAddMethod(), getCallOptions()));
        }

        public com.google.common.util.concurrent.OooO0OO<MessageEmpty.Empty> friendApply(MessageIM.FriendApplyRequest friendApplyRequest) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getFriendApplyMethod(), getCallOptions()));
        }

        public com.google.common.util.concurrent.OooO0OO<MessageEmpty.Empty> friendBlock(MessageIM.FriendBlockRequest friendBlockRequest) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getFriendBlockMethod(), getCallOptions()));
        }

        public com.google.common.util.concurrent.OooO0OO<MessageIM.FriendCheckReply> friendCheck(MessageIM.FriendCheckRequest friendCheckRequest) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getFriendCheckMethod(), getCallOptions()));
        }

        public com.google.common.util.concurrent.OooO0OO<MessageEmpty.Empty> friendDelete(MessageIM.FriendDeleteRequest friendDeleteRequest) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getFriendDeleteMethod(), getCallOptions()));
        }

        public com.google.common.util.concurrent.OooO0OO<MessageEmpty.Empty> friendUnblock(MessageIM.FriendUnblockRequest friendUnblockRequest) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getFriendUnblockMethod(), getCallOptions()));
        }

        public com.google.common.util.concurrent.OooO0OO<MessageEmpty.Empty> gifEmoticon(MessageIM.GifEmoticonIn gifEmoticonIn) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getGifEmoticonMethod(), getCallOptions()));
        }

        public com.google.common.util.concurrent.OooO0OO<MessageIM.ReceiveReply> receive(MessageIM.ReceiveRequest receiveRequest) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getReceiveMethod(), getCallOptions()));
        }

        public com.google.common.util.concurrent.OooO0OO<MessageIM.SayReply> say(MessageIM.SayRequest sayRequest) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getSayMethod(), getCallOptions()));
        }

        public com.google.common.util.concurrent.OooO0OO<MessageIM.SendEmoticonReply> sendEmoticon(MessageIM.SendEmoticonRequest sendEmoticonRequest) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getSendEmoticonMethod(), getCallOptions()));
        }

        public com.google.common.util.concurrent.OooO0OO<MessageIM.SendGiftReply> sendGift(MessageIM.SendGiftRequest sendGiftRequest) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getSendGiftMethod(), getCallOptions()));
        }

        public com.google.common.util.concurrent.OooO0OO<MessageIM.SendVoiceReply> sendVoice(MessageIM.SendVoiceRequest sendVoiceRequest) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getSendVoiceMethod(), getCallOptions()));
        }

        public com.google.common.util.concurrent.OooO0OO<MessageEmpty.Empty> shareRoom(MessageIM.ShareRoomIn shareRoomIn) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getShareRoomMethod(), getCallOptions()));
        }

        public com.google.common.util.concurrent.OooO0OO<MessageIM.UserInfoReply> userInfo(MessageIM.UserInfoRequest userInfoRequest) {
            return o000O0Oo.OooO0o0(getChannel().OooO00o(SlaveGrpc.getUserInfoMethod(), getCallOptions()));
        }

        private SlaveFutureStub(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // p641o0ooO0o0.o000O0
        public SlaveFutureStub build(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
            return new SlaveFutureStub(oooO0OO, oooO0O0);
        }

        private SlaveFutureStub(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
            super(oooO0OO, oooO0O0);
        }
    }

    public static abstract class SlaveImplBase {
        public void banStatus(MessageIM.BanStatusIn banStatusIn, o000O<MessageIM.BanStatusOut> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getBanStatusMethod(), o000o);
        }

        public final o0OoOo0 bindService() {
            o0OoOo0.OooO0O0 oooO0O0 = new o0OoOo0.OooO0O0(SlaveGrpc.getServiceDescriptor());
            MethodDescriptor<MessageIM.NotifyRequest, MessageIM.NotifyReply> notifyMethod = SlaveGrpc.getNotifyMethod();
            new MethodHandlers(this, 0);
            oooO0O0.OooO00o(notifyMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.ReceiveRequest, MessageIM.ReceiveReply> receiveMethod = SlaveGrpc.getReceiveMethod();
            new MethodHandlers(this, 1);
            oooO0O0.OooO00o(receiveMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.ConfirmRequest, MessageEmpty.Empty> confirmMethod = SlaveGrpc.getConfirmMethod();
            new MethodHandlers(this, 2);
            oooO0O0.OooO00o(confirmMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.SayRequest, MessageIM.SayReply> sayMethod = SlaveGrpc.getSayMethod();
            new MethodHandlers(this, 3);
            oooO0O0.OooO00o(sayMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.SendGiftRequest, MessageIM.SendGiftReply> sendGiftMethod = SlaveGrpc.getSendGiftMethod();
            new MethodHandlers(this, 4);
            oooO0O0.OooO00o(sendGiftMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.SendVoiceRequest, MessageIM.SendVoiceReply> sendVoiceMethod = SlaveGrpc.getSendVoiceMethod();
            new MethodHandlers(this, 5);
            oooO0O0.OooO00o(sendVoiceMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.GifEmoticonIn, MessageEmpty.Empty> gifEmoticonMethod = SlaveGrpc.getGifEmoticonMethod();
            new MethodHandlers(this, 6);
            oooO0O0.OooO00o(gifEmoticonMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.FriendAddRequest, MessageIM.FriendAddReply> friendAddMethod = SlaveGrpc.getFriendAddMethod();
            new MethodHandlers(this, 7);
            oooO0O0.OooO00o(friendAddMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.FriendDeleteRequest, MessageEmpty.Empty> friendDeleteMethod = SlaveGrpc.getFriendDeleteMethod();
            new MethodHandlers(this, 8);
            oooO0O0.OooO00o(friendDeleteMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.FriendApplyRequest, MessageEmpty.Empty> friendApplyMethod = SlaveGrpc.getFriendApplyMethod();
            new MethodHandlers(this, 9);
            oooO0O0.OooO00o(friendApplyMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.UserInfoRequest, MessageIM.UserInfoReply> userInfoMethod = SlaveGrpc.getUserInfoMethod();
            new MethodHandlers(this, 10);
            oooO0O0.OooO00o(userInfoMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.FriendCheckRequest, MessageIM.FriendCheckReply> friendCheckMethod = SlaveGrpc.getFriendCheckMethod();
            new MethodHandlers(this, 11);
            oooO0O0.OooO00o(friendCheckMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.FriendBlockRequest, MessageEmpty.Empty> friendBlockMethod = SlaveGrpc.getFriendBlockMethod();
            new MethodHandlers(this, 12);
            oooO0O0.OooO00o(friendBlockMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.FriendUnblockRequest, MessageEmpty.Empty> friendUnblockMethod = SlaveGrpc.getFriendUnblockMethod();
            new MethodHandlers(this, 13);
            oooO0O0.OooO00o(friendUnblockMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.SendEmoticonRequest, MessageIM.SendEmoticonReply> sendEmoticonMethod = SlaveGrpc.getSendEmoticonMethod();
            new MethodHandlers(this, 14);
            oooO0O0.OooO00o(sendEmoticonMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.BanStatusIn, MessageIM.BanStatusOut> banStatusMethod = SlaveGrpc.getBanStatusMethod();
            new MethodHandlers(this, 15);
            oooO0O0.OooO00o(banStatusMethod, new o000O0O0.OooO00o());
            MethodDescriptor<MessageIM.ShareRoomIn, MessageEmpty.Empty> shareRoomMethod = SlaveGrpc.getShareRoomMethod();
            new MethodHandlers(this, 16);
            oooO0O0.OooO00o(shareRoomMethod, new o000O0O0.OooO00o());
            return oooO0O0.OooO0O0();
        }

        public void confirm(MessageIM.ConfirmRequest confirmRequest, o000O<MessageEmpty.Empty> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getConfirmMethod(), o000o);
        }

        public void friendAdd(MessageIM.FriendAddRequest friendAddRequest, o000O<MessageIM.FriendAddReply> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getFriendAddMethod(), o000o);
        }

        public void friendApply(MessageIM.FriendApplyRequest friendApplyRequest, o000O<MessageEmpty.Empty> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getFriendApplyMethod(), o000o);
        }

        public void friendBlock(MessageIM.FriendBlockRequest friendBlockRequest, o000O<MessageEmpty.Empty> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getFriendBlockMethod(), o000o);
        }

        public void friendCheck(MessageIM.FriendCheckRequest friendCheckRequest, o000O<MessageIM.FriendCheckReply> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getFriendCheckMethod(), o000o);
        }

        public void friendDelete(MessageIM.FriendDeleteRequest friendDeleteRequest, o000O<MessageEmpty.Empty> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getFriendDeleteMethod(), o000o);
        }

        public void friendUnblock(MessageIM.FriendUnblockRequest friendUnblockRequest, o000O<MessageEmpty.Empty> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getFriendUnblockMethod(), o000o);
        }

        public void gifEmoticon(MessageIM.GifEmoticonIn gifEmoticonIn, o000O<MessageEmpty.Empty> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getGifEmoticonMethod(), o000o);
        }

        public void notify(MessageIM.NotifyRequest notifyRequest, o000O<MessageIM.NotifyReply> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getNotifyMethod(), o000o);
        }

        public void receive(MessageIM.ReceiveRequest receiveRequest, o000O<MessageIM.ReceiveReply> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getReceiveMethod(), o000o);
        }

        public void say(MessageIM.SayRequest sayRequest, o000O<MessageIM.SayReply> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getSayMethod(), o000o);
        }

        public void sendEmoticon(MessageIM.SendEmoticonRequest sendEmoticonRequest, o000O<MessageIM.SendEmoticonReply> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getSendEmoticonMethod(), o000o);
        }

        public void sendGift(MessageIM.SendGiftRequest sendGiftRequest, o000O<MessageIM.SendGiftReply> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getSendGiftMethod(), o000o);
        }

        public void sendVoice(MessageIM.SendVoiceRequest sendVoiceRequest, o000O<MessageIM.SendVoiceReply> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getSendVoiceMethod(), o000o);
        }

        public void shareRoom(MessageIM.ShareRoomIn shareRoomIn, o000O<MessageEmpty.Empty> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getShareRoomMethod(), o000o);
        }

        public void userInfo(MessageIM.UserInfoRequest userInfoRequest, o000O<MessageIM.UserInfoReply> o000o) {
            o000O0O0.OooO00o(SlaveGrpc.getUserInfoMethod(), o000o);
        }
    }

    public static final class SlaveStub extends o000O0<SlaveStub> {
        public void banStatus(MessageIM.BanStatusIn banStatusIn, o000O<MessageIM.BanStatusOut> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getBanStatusMethod(), getCallOptions()), o000o);
        }

        public void confirm(MessageIM.ConfirmRequest confirmRequest, o000O<MessageEmpty.Empty> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getConfirmMethod(), getCallOptions()), o000o);
        }

        public void friendAdd(MessageIM.FriendAddRequest friendAddRequest, o000O<MessageIM.FriendAddReply> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getFriendAddMethod(), getCallOptions()), o000o);
        }

        public void friendApply(MessageIM.FriendApplyRequest friendApplyRequest, o000O<MessageEmpty.Empty> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getFriendApplyMethod(), getCallOptions()), o000o);
        }

        public void friendBlock(MessageIM.FriendBlockRequest friendBlockRequest, o000O<MessageEmpty.Empty> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getFriendBlockMethod(), getCallOptions()), o000o);
        }

        public void friendCheck(MessageIM.FriendCheckRequest friendCheckRequest, o000O<MessageIM.FriendCheckReply> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getFriendCheckMethod(), getCallOptions()), o000o);
        }

        public void friendDelete(MessageIM.FriendDeleteRequest friendDeleteRequest, o000O<MessageEmpty.Empty> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getFriendDeleteMethod(), getCallOptions()), o000o);
        }

        public void friendUnblock(MessageIM.FriendUnblockRequest friendUnblockRequest, o000O<MessageEmpty.Empty> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getFriendUnblockMethod(), getCallOptions()), o000o);
        }

        public void gifEmoticon(MessageIM.GifEmoticonIn gifEmoticonIn, o000O<MessageEmpty.Empty> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getGifEmoticonMethod(), getCallOptions()), o000o);
        }

        public void notify(MessageIM.NotifyRequest notifyRequest, o000O<MessageIM.NotifyReply> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getNotifyMethod(), getCallOptions()), o000o);
        }

        public void receive(MessageIM.ReceiveRequest receiveRequest, o000O<MessageIM.ReceiveReply> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getReceiveMethod(), getCallOptions()), o000o);
        }

        public void say(MessageIM.SayRequest sayRequest, o000O<MessageIM.SayReply> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getSayMethod(), getCallOptions()), o000o);
        }

        public void sendEmoticon(MessageIM.SendEmoticonRequest sendEmoticonRequest, o000O<MessageIM.SendEmoticonReply> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getSendEmoticonMethod(), getCallOptions()), o000o);
        }

        public void sendGift(MessageIM.SendGiftRequest sendGiftRequest, o000O<MessageIM.SendGiftReply> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getSendGiftMethod(), getCallOptions()), o000o);
        }

        public void sendVoice(MessageIM.SendVoiceRequest sendVoiceRequest, o000O<MessageIM.SendVoiceReply> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getSendVoiceMethod(), getCallOptions()), o000o);
        }

        public void shareRoom(MessageIM.ShareRoomIn shareRoomIn, o000O<MessageEmpty.Empty> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getShareRoomMethod(), getCallOptions()), o000o);
        }

        public void userInfo(MessageIM.UserInfoRequest userInfoRequest, o000O<MessageIM.UserInfoReply> o000o) {
            o000O0Oo.OooO0O0(getChannel().OooO00o(SlaveGrpc.getUserInfoMethod(), getCallOptions()), o000o);
        }

        private SlaveStub(OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // p641o0ooO0o0.o000O0
        public SlaveStub build(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
            return new SlaveStub(oooO0OO, oooO0O0);
        }

        private SlaveStub(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
            super(oooO0OO, oooO0O0);
        }
    }

    private SlaveGrpc() {
    }

    @RpcMethod(fullMethodName = "slave.Slave/BanStatus", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.BanStatusIn.class, responseType = MessageIM.BanStatusOut.class)
    public static MethodDescriptor<MessageIM.BanStatusIn, MessageIM.BanStatusOut> getBanStatusMethod() {
        MethodDescriptor<MessageIM.BanStatusIn, MessageIM.BanStatusOut> methodDescriptorOooO00o = getBanStatusMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getBanStatusMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "BanStatus");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.BanStatusIn defaultInstance = MessageIM.BanStatusIn.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageIM.BanStatusOut.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getBanStatusMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    @RpcMethod(fullMethodName = "slave.Slave/Confirm", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.ConfirmRequest.class, responseType = MessageEmpty.Empty.class)
    public static MethodDescriptor<MessageIM.ConfirmRequest, MessageEmpty.Empty> getConfirmMethod() {
        MethodDescriptor<MessageIM.ConfirmRequest, MessageEmpty.Empty> methodDescriptorOooO00o = getConfirmMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getConfirmMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "Confirm");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.ConfirmRequest defaultInstance = MessageIM.ConfirmRequest.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageEmpty.Empty.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getConfirmMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    @RpcMethod(fullMethodName = "slave.Slave/FriendAdd", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.FriendAddRequest.class, responseType = MessageIM.FriendAddReply.class)
    public static MethodDescriptor<MessageIM.FriendAddRequest, MessageIM.FriendAddReply> getFriendAddMethod() {
        MethodDescriptor<MessageIM.FriendAddRequest, MessageIM.FriendAddReply> methodDescriptorOooO00o = getFriendAddMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getFriendAddMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "FriendAdd");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.FriendAddRequest defaultInstance = MessageIM.FriendAddRequest.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageIM.FriendAddReply.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getFriendAddMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    @RpcMethod(fullMethodName = "slave.Slave/FriendApply", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.FriendApplyRequest.class, responseType = MessageEmpty.Empty.class)
    public static MethodDescriptor<MessageIM.FriendApplyRequest, MessageEmpty.Empty> getFriendApplyMethod() {
        MethodDescriptor<MessageIM.FriendApplyRequest, MessageEmpty.Empty> methodDescriptorOooO00o = getFriendApplyMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getFriendApplyMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "FriendApply");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.FriendApplyRequest defaultInstance = MessageIM.FriendApplyRequest.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageEmpty.Empty.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getFriendApplyMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    @RpcMethod(fullMethodName = "slave.Slave/FriendBlock", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.FriendBlockRequest.class, responseType = MessageEmpty.Empty.class)
    public static MethodDescriptor<MessageIM.FriendBlockRequest, MessageEmpty.Empty> getFriendBlockMethod() {
        MethodDescriptor<MessageIM.FriendBlockRequest, MessageEmpty.Empty> methodDescriptorOooO00o = getFriendBlockMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getFriendBlockMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "FriendBlock");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.FriendBlockRequest defaultInstance = MessageIM.FriendBlockRequest.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageEmpty.Empty.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getFriendBlockMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    @RpcMethod(fullMethodName = "slave.Slave/FriendCheck", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.FriendCheckRequest.class, responseType = MessageIM.FriendCheckReply.class)
    public static MethodDescriptor<MessageIM.FriendCheckRequest, MessageIM.FriendCheckReply> getFriendCheckMethod() {
        MethodDescriptor<MessageIM.FriendCheckRequest, MessageIM.FriendCheckReply> methodDescriptorOooO00o = getFriendCheckMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getFriendCheckMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "FriendCheck");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.FriendCheckRequest defaultInstance = MessageIM.FriendCheckRequest.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageIM.FriendCheckReply.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getFriendCheckMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    @RpcMethod(fullMethodName = "slave.Slave/FriendDelete", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.FriendDeleteRequest.class, responseType = MessageEmpty.Empty.class)
    public static MethodDescriptor<MessageIM.FriendDeleteRequest, MessageEmpty.Empty> getFriendDeleteMethod() {
        MethodDescriptor<MessageIM.FriendDeleteRequest, MessageEmpty.Empty> methodDescriptorOooO00o = getFriendDeleteMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getFriendDeleteMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "FriendDelete");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.FriendDeleteRequest defaultInstance = MessageIM.FriendDeleteRequest.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageEmpty.Empty.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getFriendDeleteMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    @RpcMethod(fullMethodName = "slave.Slave/FriendUnblock", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.FriendUnblockRequest.class, responseType = MessageEmpty.Empty.class)
    public static MethodDescriptor<MessageIM.FriendUnblockRequest, MessageEmpty.Empty> getFriendUnblockMethod() {
        MethodDescriptor<MessageIM.FriendUnblockRequest, MessageEmpty.Empty> methodDescriptorOooO00o = getFriendUnblockMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getFriendUnblockMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "FriendUnblock");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.FriendUnblockRequest defaultInstance = MessageIM.FriendUnblockRequest.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageEmpty.Empty.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getFriendUnblockMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    @RpcMethod(fullMethodName = "slave.Slave/GifEmoticon", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.GifEmoticonIn.class, responseType = MessageEmpty.Empty.class)
    public static MethodDescriptor<MessageIM.GifEmoticonIn, MessageEmpty.Empty> getGifEmoticonMethod() {
        MethodDescriptor<MessageIM.GifEmoticonIn, MessageEmpty.Empty> methodDescriptorOooO00o = getGifEmoticonMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getGifEmoticonMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "GifEmoticon");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.GifEmoticonIn defaultInstance = MessageIM.GifEmoticonIn.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageEmpty.Empty.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getGifEmoticonMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    @RpcMethod(fullMethodName = "slave.Slave/Notify", methodType = MethodDescriptor.MethodType.SERVER_STREAMING, requestType = MessageIM.NotifyRequest.class, responseType = MessageIM.NotifyReply.class)
    public static MethodDescriptor<MessageIM.NotifyRequest, MessageIM.NotifyReply> getNotifyMethod() {
        MethodDescriptor<MessageIM.NotifyRequest, MessageIM.NotifyReply> methodDescriptorOooO00o = getNotifyMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getNotifyMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.SERVER_STREAMING;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "Notify");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.NotifyRequest defaultInstance = MessageIM.NotifyRequest.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageIM.NotifyReply.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getNotifyMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    @RpcMethod(fullMethodName = "slave.Slave/Receive", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.ReceiveRequest.class, responseType = MessageIM.ReceiveReply.class)
    public static MethodDescriptor<MessageIM.ReceiveRequest, MessageIM.ReceiveReply> getReceiveMethod() {
        MethodDescriptor<MessageIM.ReceiveRequest, MessageIM.ReceiveReply> methodDescriptorOooO00o = getReceiveMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getReceiveMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "Receive");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.ReceiveRequest defaultInstance = MessageIM.ReceiveRequest.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageIM.ReceiveReply.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getReceiveMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    @RpcMethod(fullMethodName = "slave.Slave/Say", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.SayRequest.class, responseType = MessageIM.SayReply.class)
    public static MethodDescriptor<MessageIM.SayRequest, MessageIM.SayReply> getSayMethod() {
        MethodDescriptor<MessageIM.SayRequest, MessageIM.SayReply> methodDescriptorOooO00o = getSayMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getSayMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "Say");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.SayRequest defaultInstance = MessageIM.SayRequest.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageIM.SayReply.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getSayMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    @RpcMethod(fullMethodName = "slave.Slave/SendEmoticon", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.SendEmoticonRequest.class, responseType = MessageIM.SendEmoticonReply.class)
    public static MethodDescriptor<MessageIM.SendEmoticonRequest, MessageIM.SendEmoticonReply> getSendEmoticonMethod() {
        MethodDescriptor<MessageIM.SendEmoticonRequest, MessageIM.SendEmoticonReply> methodDescriptorOooO00o = getSendEmoticonMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getSendEmoticonMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "SendEmoticon");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.SendEmoticonRequest defaultInstance = MessageIM.SendEmoticonRequest.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageIM.SendEmoticonReply.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getSendEmoticonMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    @RpcMethod(fullMethodName = "slave.Slave/SendGift", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.SendGiftRequest.class, responseType = MessageIM.SendGiftReply.class)
    public static MethodDescriptor<MessageIM.SendGiftRequest, MessageIM.SendGiftReply> getSendGiftMethod() {
        MethodDescriptor<MessageIM.SendGiftRequest, MessageIM.SendGiftReply> methodDescriptorOooO00o = getSendGiftMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getSendGiftMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "SendGift");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.SendGiftRequest defaultInstance = MessageIM.SendGiftRequest.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageIM.SendGiftReply.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getSendGiftMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    @RpcMethod(fullMethodName = "slave.Slave/SendVoice", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.SendVoiceRequest.class, responseType = MessageIM.SendVoiceReply.class)
    public static MethodDescriptor<MessageIM.SendVoiceRequest, MessageIM.SendVoiceReply> getSendVoiceMethod() {
        MethodDescriptor<MessageIM.SendVoiceRequest, MessageIM.SendVoiceReply> methodDescriptorOooO00o = getSendVoiceMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getSendVoiceMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "SendVoice");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.SendVoiceRequest defaultInstance = MessageIM.SendVoiceRequest.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageIM.SendVoiceReply.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getSendVoiceMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    public static o00O0O getServiceDescriptor() {
        o00O0O o00o0o2 = serviceDescriptor;
        if (o00o0o2 == null) {
            synchronized (SlaveGrpc.class) {
                o00o0o2 = serviceDescriptor;
                if (o00o0o2 == null) {
                    o00O0O.OooO00o OooO00o2 = o00O0O.OooO00o(SERVICE_NAME);
                    OooO00o2.OooO00o(getNotifyMethod());
                    OooO00o2.OooO00o(getReceiveMethod());
                    OooO00o2.OooO00o(getConfirmMethod());
                    OooO00o2.OooO00o(getSayMethod());
                    OooO00o2.OooO00o(getSendGiftMethod());
                    OooO00o2.OooO00o(getSendVoiceMethod());
                    OooO00o2.OooO00o(getGifEmoticonMethod());
                    OooO00o2.OooO00o(getFriendAddMethod());
                    OooO00o2.OooO00o(getFriendDeleteMethod());
                    OooO00o2.OooO00o(getFriendApplyMethod());
                    OooO00o2.OooO00o(getUserInfoMethod());
                    OooO00o2.OooO00o(getFriendCheckMethod());
                    OooO00o2.OooO00o(getFriendBlockMethod());
                    OooO00o2.OooO00o(getFriendUnblockMethod());
                    OooO00o2.OooO00o(getSendEmoticonMethod());
                    OooO00o2.OooO00o(getBanStatusMethod());
                    OooO00o2.OooO00o(getShareRoomMethod());
                    o00O0O o00o0o3 = new o00O0O(OooO00o2);
                    serviceDescriptor = o00o0o3;
                    o00o0o2 = o00o0o3;
                }
            }
        }
        return o00o0o2;
    }

    @RpcMethod(fullMethodName = "slave.Slave/ShareRoom", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.ShareRoomIn.class, responseType = MessageEmpty.Empty.class)
    public static MethodDescriptor<MessageIM.ShareRoomIn, MessageEmpty.Empty> getShareRoomMethod() {
        MethodDescriptor<MessageIM.ShareRoomIn, MessageEmpty.Empty> methodDescriptorOooO00o = getShareRoomMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getShareRoomMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "ShareRoom");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.ShareRoomIn defaultInstance = MessageIM.ShareRoomIn.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageEmpty.Empty.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getShareRoomMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    @RpcMethod(fullMethodName = "slave.Slave/UserInfo", methodType = MethodDescriptor.MethodType.UNARY, requestType = MessageIM.UserInfoRequest.class, responseType = MessageIM.UserInfoReply.class)
    public static MethodDescriptor<MessageIM.UserInfoRequest, MessageIM.UserInfoReply> getUserInfoMethod() {
        MethodDescriptor<MessageIM.UserInfoRequest, MessageIM.UserInfoReply> methodDescriptorOooO00o = getUserInfoMethod;
        if (methodDescriptorOooO00o == null) {
            synchronized (SlaveGrpc.class) {
                methodDescriptorOooO00o = getUserInfoMethod;
                if (methodDescriptorOooO00o == null) {
                    MethodDescriptor.OooO00o oooO00oOooO0O0 = MethodDescriptor.OooO0O0();
                    oooO00oOooO0O0.f26370OooO0OO = MethodDescriptor.MethodType.UNARY;
                    oooO00oOooO0O0.f26371OooO0Oo = MethodDescriptor.OooO00o(SERVICE_NAME, "UserInfo");
                    oooO00oOooO0O0.f26372OooO0o0 = true;
                    MessageIM.UserInfoRequest defaultInstance = MessageIM.UserInfoRequest.getDefaultInstance();
                    int i = o000OO0O.f48878OooO00o;
                    oooO00oOooO0O0.f26368OooO00o = new o000OO0O.OooO00o(defaultInstance);
                    oooO00oOooO0O0.f26369OooO0O0 = new o000OO0O.OooO00o(MessageIM.UserInfoReply.getDefaultInstance());
                    methodDescriptorOooO00o = oooO00oOooO0O0.OooO00o();
                    getUserInfoMethod = methodDescriptorOooO00o;
                }
            }
        }
        return methodDescriptorOooO00o;
    }

    public static SlaveBlockingStub newBlockingStub(OooO0OO oooO0OO) {
        return new SlaveBlockingStub(oooO0OO);
    }

    public static SlaveFutureStub newFutureStub(OooO0OO oooO0OO) {
        return new SlaveFutureStub(oooO0OO);
    }

    public static SlaveStub newStub(OooO0OO oooO0OO) {
        return new SlaveStub(oooO0OO);
    }

    public static final class MethodHandlers<Req, Resp> {
        private final int methodId;
        private final SlaveImplBase serviceImpl;

        public MethodHandlers(SlaveImplBase slaveImplBase, int i) {
            this.serviceImpl = slaveImplBase;
            this.methodId = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void invoke(Req req, o000O<Resp> o000o) {
            switch (this.methodId) {
                case 0:
                    this.serviceImpl.notify((MessageIM.NotifyRequest) req, o000o);
                    return;
                case 1:
                    this.serviceImpl.receive((MessageIM.ReceiveRequest) req, o000o);
                    return;
                case 2:
                    this.serviceImpl.confirm((MessageIM.ConfirmRequest) req, o000o);
                    return;
                case 3:
                    this.serviceImpl.say((MessageIM.SayRequest) req, o000o);
                    return;
                case 4:
                    this.serviceImpl.sendGift((MessageIM.SendGiftRequest) req, o000o);
                    return;
                case 5:
                    this.serviceImpl.sendVoice((MessageIM.SendVoiceRequest) req, o000o);
                    return;
                case 6:
                    this.serviceImpl.gifEmoticon((MessageIM.GifEmoticonIn) req, o000o);
                    return;
                case 7:
                    this.serviceImpl.friendAdd((MessageIM.FriendAddRequest) req, o000o);
                    return;
                case 8:
                    this.serviceImpl.friendDelete((MessageIM.FriendDeleteRequest) req, o000o);
                    return;
                case 9:
                    this.serviceImpl.friendApply((MessageIM.FriendApplyRequest) req, o000o);
                    return;
                case 10:
                    this.serviceImpl.userInfo((MessageIM.UserInfoRequest) req, o000o);
                    return;
                case 11:
                    this.serviceImpl.friendCheck((MessageIM.FriendCheckRequest) req, o000o);
                    return;
                case 12:
                    this.serviceImpl.friendBlock((MessageIM.FriendBlockRequest) req, o000o);
                    return;
                case 13:
                    this.serviceImpl.friendUnblock((MessageIM.FriendUnblockRequest) req, o000o);
                    return;
                case 14:
                    this.serviceImpl.sendEmoticon((MessageIM.SendEmoticonRequest) req, o000o);
                    return;
                case 15:
                    this.serviceImpl.banStatus((MessageIM.BanStatusIn) req, o000o);
                    return;
                case 16:
                    this.serviceImpl.shareRoom((MessageIM.ShareRoomIn) req, o000o);
                    return;
                default:
                    throw new AssertionError();
            }
        }

        public o000O<Req> invoke(o000O<Resp> o000o) {
            throw new AssertionError();
        }
    }
}
