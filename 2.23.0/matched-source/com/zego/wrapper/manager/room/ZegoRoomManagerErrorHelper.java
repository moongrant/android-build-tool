package com.zego.wrapper.manager.room;

import com.zego.wrapper.manager.entity.ResultCode;
import com.zego.zegoavkit2.error.ZegoError;

/* JADX INFO: loaded from: classes5.dex */
public final class ZegoRoomManagerErrorHelper {
    public static final int LOGIN_ROOM_TIME_OUT_ERROR_CODE = -69905;
    public static final int PARAM_ERROR_CODE = -69906;

    /* JADX WARN: Code duplicated, block: B:8:0x0011  */
    public static ResultCode createResultCodeByKickOutReason(int i) {
        String str;
        if (i != 52000141) {
            switch (i) {
                case ZegoError.kRoomMultipleLoginKickoutError /* 63000001 */:
                    str = "账户多点登录被踢出";
                    break;
                case ZegoError.kRoomManualKickoutError /* 63000002 */:
                    str = "被主动踢出";
                    break;
                case ZegoError.kRoomSessionErrorKickoutError /* 63000003 */:
                    str = "房间会话错误被踢出";
                    break;
                default:
                    str = "undefined error";
                    break;
            }
        } else {
            str = "房间会话错误被踢出";
        }
        return new ResultCode(i, str);
    }

    public static ResultCode createResultCodeByLiveEventTempBrokenReason() {
        return new ResultCode(7, "流临时断开，SDK将自动重试");
    }

    public static ResultCode createResultCodeByPlayState(int i) {
        String str = "无法连接房间服务器，请检查网络是否正常";
        switch (i) {
            case ZegoError.kNetworkDnsResolveError /* 11000404 */:
                str = "DNS 解析失败，请检查网络是否正常";
                break;
            case ZegoError.kEngineNoPlayDataError /* 12102001 */:
                str = "拉流无法拉到数据，请检查拉的流是否存在或者网络是否正常";
                break;
            case ZegoError.kEngineConnectServerError /* 12200001 */:
                str = "连接 RTMP 服务器失败，请检查网络是否正常";
                break;
            case ZegoError.kEngineRtmpHandshakeError /* 12200002 */:
                str = "RTMP 服务连接握手失败，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kEngineRtmpAppConnectError /* 12200003 */:
                str = "连接 RTMP 服务器失败，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kEngineServerDisconnectError /* 12200006 */:
                str = "RTMP 服务器断开连接，请检查网络是否正常";
                break;
            case ZegoError.kEngineRtpConnectServerError /* 12200100 */:
                str = "连接 RTP 服务器失败，请检查网络是否正常";
                break;
            case ZegoError.kEngineRtpHelloTimeoutError /* 12200101 */:
                str = "连接 RTP 服务器超时，请检查网络是否正常";
                break;
            case ZegoError.kEngineRtpCreateSessionTimeoutError /* 12200102 */:
                str = "与 RTP 服务器创建 session 超时，请检查网络是否正常";
                break;
            case ZegoError.kEngineRtpTimeoutError /* 12200106 */:
                str = "RTP 超时，请检查网络是否正常";
                break;
            case ZegoError.kEngineHttpFlvServerDisconnectError /* 12200203 */:
                str = "http flv 服务器断开连接，请检查网络是否正常";
                break;
            case ZegoError.kPlayStreamNotExistError /* 12301004 */:
                str = "拉的流不存在，请检查拉取的流是否已推流成功";
                break;
            case ZegoError.kMediaServerForbidError /* 12301011 */:
                str = "ZEGO 后台禁止推流，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kConfigServerCouldntConnectError /* 21200007 */:
                str = "无法连接配置服务器，请检查网络是否正常";
                break;
            case ZegoError.kConfigServerTimeoutError /* 21200028 */:
                str = "连接配置服务器超时，请检查网络是否正常";
                break;
            case ZegoError.kDispatchStreamNotExistError /* 32001004 */:
                str = "调度服务器报错，流不存在，请检查拉取的流是否已推流成功";
                break;
            case ZegoError.kLiveRoomHBTimeoutError /* 50001002 */:
                str = "房间心跳超时，请检查网络是否正常";
                break;
            case ZegoError.kLiveRoomCouldntConnectError /* 51200007 */:
            case ZegoError.kRoomConnectError /* 60001001 */:
                break;
            case ZegoError.kLiveRoomTimeoutError /* 51200028 */:
                str = "连接房间服务器超时，请检查网络是否正常";
                break;
            case ZegoError.kLiveRoomNotLoginError /* 52000105 */:
                str = "房间服务器报错，未登录房间，请检查是否已成功登录房间";
                break;
            case ZegoError.kLiveRoomSessionError /* 52000141 */:
                str = "房间服务器报错，Session错误，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kLiveRoomAddUserError /* 52001002 */:
                str = "房间服务器报错，添加用户失败，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kRoomTimeoutError /* 60001004 */:
                str = "登录房间服务器超时，请检查网络是否正常";
                break;
            case ZegoError.kRoomHbTimeoutError /* 60001005 */:
                str = "房间服务器心跳超时,请检查网络是否正常";
                break;
            case ZegoError.kRoomDecodeSignError /* 62001001 */:
                str = "房间服务器报错，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kRoomMultipleLoginKickoutError /* 63000001 */:
                str = "重复登录房间被踢，请检查是否已登录房间";
                break;
            default:
                str = "undefined error";
                break;
        }
        return new ResultCode(i, str);
    }

    public static ResultCode createResultCodeByPublishState(int i) {
        String str = "无法连接房间服务器，请检查网络是否正常";
        switch (i) {
            case ZegoError.kNotLoginError /* 10000105 */:
                str = "未登录房间，请检查是否已成功登录房间";
                break;
            case ZegoError.kPublishBadNameError /* 10000106 */:
                str = "重复的推流流名";
                break;
            case ZegoError.kFormatUrlError /* 10001102 */:
                str = "URL 格式错误，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kNetworkDnsResolveError /* 11000404 */:
                str = "DNS 解析失败，请确认startPublishing 的 flag 是否为0/2，正确的情况下再检查网络是否正常";
                break;
            case ZegoError.kDeniedDisableSwitchLineError /* 12101005 */:
                str = "禁止切换线路重推，请调用推流接口重新推流";
                break;
            case ZegoError.kEngineNoPublishDataError /* 12102002 */:
                str = "推流无法推出数据，请检查网络是否正常";
                break;
            case ZegoError.kEngineConnectServerError /* 12200001 */:
                str = "连接 RTMP 服务器失败，请检查网络是否正常";
                break;
            case ZegoError.kEngineServerDisconnectError /* 12200006 */:
                str = "RTMP 服务器断开连接，请检查网络是否正常";
                break;
            case ZegoError.kEngineRtpConnectServerError /* 12200100 */:
                str = "连接 RTP 服务器失败，请检查网络是否正常";
                break;
            case ZegoError.kEngineRtpHelloTimeoutError /* 12200101 */:
                str = "连接 RTP 服务器超时，请检查网络是否正常";
                break;
            case ZegoError.kEngineRtpCreateSessionTimeoutError /* 12200102 */:
                str = "与 RTP 服务器创建 session 超时，请检查网络是否正常";
                break;
            case ZegoError.kEngineRtpTimeoutError /* 12200106 */:
                str = "RTP 超时，请检查网络是否正常";
                break;
            case ZegoError.kPlayStreamNotExistError /* 12301004 */:
                str = "流不存在，请检查拉取的流是否已推流成功";
                break;
            case ZegoError.kMediaServerForbidError /* 12301011 */:
                str = "ZEGO 后台禁止推流，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kMediaServerPublishBadNameError /* 12301012 */:
                str = "推流使用重复的流名";
                break;
            case ZegoError.kConfigMediaNetworkNoUrlError /* 20000005 */:
                str = "媒体服务无 URL，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kConfigServerCouldntConnectError /* 21200007 */:
                str = "无法连接配置服务器，请检查网络是否正常";
                break;
            case ZegoError.kConfigServerTimeoutError /* 21200028 */:
                str = "连接配置服务器超时，请检查网络是否正常";
                break;
            case ZegoError.kDispatchServerCouldntConnectError /* 31200007 */:
                str = "无法连接调度服务器，请检查网络是否正常";
                break;
            case ZegoError.kDispatchServerTimeoutError /* 31200028 */:
                str = "连接调度服务器超时，请检查网络是否正常";
                break;
            case ZegoError.kLiveRoomRequestParamError /* 50001001 */:
                str = "房间参数错误，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kLiveRoomHBTimeoutError /* 50001002 */:
                str = "房间心跳超时，请检查网络是否正常";
                break;
            case ZegoError.kLiveRoomNoPushServerAddrError /* 50001003 */:
                str = "未找到推流服务地址，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kLiveRoomCouldntConnectError /* 51200007 */:
            case ZegoError.kRoomConnectError /* 60001001 */:
                break;
            case ZegoError.kLiveRoomTimeoutError /* 51200028 */:
                str = "连接房间服务器超时，请检查网络是否正常";
                break;
            case ZegoError.kLiveRoomRoomAuthError /* 52000101 */:
                str = "房间服务器报错，鉴权失败，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kLiveRoomNotLoginError /* 52000105 */:
                str = "房间服务器报错，未登录房间，请检查是否已成功登录房间";
                break;
            case ZegoError.kLiveRoomAddUserError /* 52001002 */:
                str = "房间服务器报错，添加用户失败，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kLiveRoomPublishBadNameError /* 52001012 */:
                str = "房间服务器报错，重复的推流流名";
                break;
            case ZegoError.kLiveRoomNetBrokenTimeoutError /* 52002003 */:
            case ZegoError.kRoomDecodeSignError /* 62001001 */:
            case ZegoError.kRoomLoginCreateUserError /* 62010001 */:
            case ZegoError.kRoomStatusRspError /* 62010006 */:
                str = "房间服务器报错，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kRoomTimeoutError /* 60001004 */:
                str = "登录房间服务器超时，请检查网络是否正常";
                break;
            case ZegoError.kRoomHbTimeoutError /* 60001005 */:
                str = "房间服务器心跳超时，请检查网络是否正常";
                break;
            case ZegoError.kRoomMultipleLoginKickoutError /* 63000001 */:
                str = "重复登录房间被踢，请检查是否已登录房间";
                break;
            default:
                str = "undefined error";
                break;
        }
        return new ResultCode(i, str);
    }

    public static ResultCode createResultCodeByRoomDisconnectReason(int i) {
        String str;
        switch (i) {
            case ZegoError.kLiveRoomAddUserError /* 52001002 */:
                str = "房间服务器报错，添加用户失败，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kRoomConnectError /* 60001001 */:
                str = "无法连接房间服务器，请检查网络是否正常";
                break;
            case ZegoError.kRoomTimeoutError /* 60001004 */:
                str = "登录房间服务器超时，请检查网络是否正常";
                break;
            case ZegoError.kRoomHbTimeoutError /* 60001005 */:
                str = "房间服务器心跳超时，请检查网络是否正常";
                break;
            case ZegoError.kRoomDecodeSignError /* 62001001 */:
            case ZegoError.kRoomLoginSameCreateUserError /* 62010002 */:
            case ZegoError.kRoomStatusRspError /* 62010006 */:
                str = "房间服务器报错，请联系 ZEGO 技术支持解决";
                break;
            default:
                str = "undefined error";
                break;
        }
        return new ResultCode(i, str);
    }

    public static ResultCode createResultCodeByRoomTempBrokenReason(int i) {
        return new ResultCode(i, "connect temp broke");
    }

    public static ResultCode createResultCodeBySendCmdErrorCode(int i) {
        String str;
        if (ZegoError.isNotLoginError(i)) {
            str = "未登录就发送信令消息";
        } else if (i != -69906) {
            str = i != 10000105 ? "network error" : "not login";
        } else {
            str = "param invalid";
        }
        return new ResultCode(i, str);
    }

    public static ResultCode createRoomResultCode(int i) {
        String str = "房间服务器报错，请联系 ZEGO 技术支持解决";
        switch (i) {
            case PARAM_ERROR_CODE /* -69906 */:
                str = "参数非法";
                break;
            case LOGIN_ROOM_TIME_OUT_ERROR_CODE /* -69905 */:
                str = "登录重试超时";
                break;
            case ZegoError.kConfigServerCouldntConnectError /* 21200007 */:
                str = "无法连接配置服务器，请检查网络是否正常";
                break;
            case ZegoError.kConfigServerTimeoutError /* 21200028 */:
                str = "连接配置服务器超时，请检查网络是否正常";
                break;
            case ZegoError.kLiveRoomCouldntConnectError /* 51200007 */:
            case ZegoError.kRoomConnectError /* 60001001 */:
                str = "无法连接房间服务器，请检查网络是否正常";
                break;
            case ZegoError.kLiveRoomTimeoutError /* 51200028 */:
                str = "连接房间服务器超时，请检查网络是否正常";
                break;
            case ZegoError.kLiveRoomAddUserError /* 52001002 */:
                str = "房间服务器报错，添加用户失败，请联系 ZEGO 技术支持解决（设置了观众无法创建房间后，以观众身份创建房间）";
                break;
            case ZegoError.kRoomDoLoginReqError /* 60001003 */:
                str = "发送 login 到房间服务器失败，请检查网络是否正常";
                break;
            case ZegoError.kRoomTimeoutError /* 60001004 */:
                str = "登录房间服务器超时，请检查网络是否正常";
                break;
            case ZegoError.kRoomHbTimeoutError /* 60001005 */:
                str = "房间服务器心跳超时，请检查网络是否正常";
                break;
            case ZegoError.kRoomStartConnectError /* 60001006 */:
                str = "与房间服务器连接失败，请联系 ZEGO 技术支持解决";
                break;
            case ZegoError.kRoomDecodeSignError /* 62001001 */:
            case ZegoError.kRoomStatusRspError /* 62010006 */:
                break;
            default:
                str = "undefined error";
                break;
        }
        return new ResultCode(i, str);
    }
}
