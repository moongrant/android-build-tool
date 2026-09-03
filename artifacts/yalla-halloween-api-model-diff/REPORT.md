# Yalla Halloween Historical API / Model Diff

- Requested versions: 6
- Decompiled versions: 5

| Version | Matched source | API paths | Field/model files | Halloween term files | Yalla URLs |
|---|---:|---:|---:|---:|---:|
| 2.17.0 | 0 | 0 | 0 | 0 | 0 |
| 2.18.0 | 1158 | 322 | 181 | 1013 | 23 |
| 2.18.1 | 1157 | 322 | 181 | 1012 | 23 |
| 2.23.0 | 1379 | 376 | 213 | 1196 | 37 |
| 2.23.1 | 1461 | 378 | 219 | 1278 | 37 |
| 2.23.2 | 1451 | 379 | 217 | 1268 | 37 |

## Activity, banner, event and room-theme API surface

| API path | 2.17.0 | 2.18.0 | 2.18.1 | 2.23.0 | 2.23.1 | 2.23.2 |
|---|---|---|---|---|---|---|
| `/Webservers/Account/UserUnBindingThirdAccount` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/Account/YallaChatAuthVerify` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Account/YallaChatLogin` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Api/GetConfig` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/Api/GetInitConfig` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/Api/Info` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Apk/ApkUpgrade` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Apk/CheckNetwork` |  | ✓ | ✓ |  |  |  |
| `/Webservers/Apk/EnterRoomLog` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Apk/MomentBehaviorLog` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Apk/RoomExposureLog` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Apk/SubmitUserNPS` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Apk/UploadNetworkLog` |  | ✓ | ✓ |  |  |  |
| `/Webservers/Apk/UserSearchLog` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Apk/UserVoiceLog` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/AppUI/GetConfig` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/AppUI/GetCountry` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/Bar/AdvertiBlockIns` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BarBlockUserList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BarExecSearch` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BarFollow` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BarFollowList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BarHomeNew` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BarHomePage` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BarHotLiveList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BarInfoEidt` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BarJoinList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BarLables` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BarLevelProgress` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BarMemberlist` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BarOneKeyFollow` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BarUpgradeBar` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BarUpgradeBarBefore` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BatchRemBarMembers` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BatchRoomMemberList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/BuyEmoji` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/CheckConveneMemberStatus` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/CheckFollowAndJoin` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/CheckInRoom` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/Bar/ConveneBarMember` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/ConveneBarMemberlist` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/CountryHotSort` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/EmojiConfig` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/GameConfig` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/GameLogList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/GamePropConfigList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/GetBannerList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/GetCallingMemberList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/GetConveneMemberState` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/GetCountryOfPwdRoomLimited` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/GetPropConfigList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/GetRedPaper` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/GetUserBackpackPropInventory` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/Bar/GiftRedPaperRankList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/InitConfig` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/KickOutRoomList` |  | ✓ | ✓ |  |  |  |
| `/Webservers/Bar/PersonalBar` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/QuickCreateRoom` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/RecommendedAttention` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/RedPaperPropList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/RedPaperRankList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/RoomInfo` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/RoomShareList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/RoomShareLog` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/RoomThemeEdit` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/SearchBarRecommend` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/SetEventManage` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/SingleBarSearch` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/SingleBarlist` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/TaskBar` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Bar/UnJoinBar` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CheckCircleInfo` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleAdmin` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleAdminIns` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleBlackIns` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleBlackList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleCreate` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleCreateBefore` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleDiscoveryDelete` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleDiscoveryTopIns` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleInfoEdit` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleJoinIns` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleJoinList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleMemberlist` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleNewList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CirclePersonRecommendList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CirclePersonal` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleRecommendList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleRecommendTypeList` |  | ✓ | ✓ |  |  |  |
| `/Webservers/Circle/CircleSearch` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleSearchRmdList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleSingle` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleTypeConfigList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Circle/CircleUserVerify` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Comment/CommentSendProp` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Comment/CommentSltPcid` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Comment/Del` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Comment/GetInfo` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Comment/List` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Comment/Praise` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Comment/SonList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Comment/Write` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Discovery/CircleDiscovery` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Discovery/EditMoment` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Discovery/EditMomentBefore` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Discovery/GetEditHistory` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Discovery/RecommendSquare` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Discovery/SquareBarMember` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Discovery/SquareHot` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Discovery/SquarePersonal` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Discovery/SquareSingle` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Event/AddShareLog` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Event/Create` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Event/CreateBefore` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Event/Delete` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Event/GetHistoryList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Event/GetInfo` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Event/GetJoinRoomList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Event/GetList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Event/GetListByRoom` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Event/GetMyList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Event/GetTagList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Event/GetTop5` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Event/Report` |  | ✓ | ✓ |  |  |  |
| `/Webservers/Event/SetConfig` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Event/Subscribe` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/KaPoint/GetRecord` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/KaPoint/GetShopPage` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/KaPoint/GetShopTop` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/Medal/MedalRankTop` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Medal/UserMedalEdit` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Medal/UserMedalGetList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Medal/UserMedalList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Messages/ActivityList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Messages/BarBlockUserSearch` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Messages/BarInListME` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Messages/BarKickOutUserSearch` |  | ✓ | ✓ |  |  |  |
| `/Webservers/Messages/CheckIsFriend` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Messages/CircleBlockUserSearch` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Messages/FriendMylist` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Messages/SearchRecommend` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Messages/SetFriendMemoName` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Messages/UserCompanionsInRoomList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Messages/UserCompanionsList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Messages/UserFollow` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Messages/UserSearch` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Messages/UserVisitorlist` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Messages/VisitorLogClick` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/AdvertiBlockIns` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/BarGetServerIP` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/CheckUserBlack` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/Del` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/DiscoveryTopIns` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/DyRecommendUsers` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/DySendPropDetail` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/GetBannerList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/GetCircleInfoByDyId` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/GetVoteConfig` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/GetVoteInfo` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/MomentsDurationAdd` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/PerPhoto` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/Praise` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/PraiseList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/PublishV1` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/ReportPublish` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/SendProp` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/SquareFriendIsNew` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Moment/Vote` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/RankingList/RankingTopAll` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/RankingList/UserSupportersRank` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Recharge/HuaWeiSubscribePremium` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Recharge/HuaweiNotifyUrl` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Recharge/HuaweiPayOrder` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Recharge/PayssionPayOrder` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Recharge/PayssionState` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Recharge/RechargeCoinAndroidV1` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Recharge/RechargeCoinOrder` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Recharge/RechargeConfigList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Recharge/RechargeConfigListAll` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Recharge/RechargeErrort` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Recharge/RechargeShopAndroid` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Recharge/RechargeShopOrder` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Recharge/TapPayOrder` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Recharge/TapPayState` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Recharge/TransactionDetails` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Report/Add` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Report/GetReason` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Resource/GetUploadToken` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Resource/PicQiniu` |  | ✓ | ✓ |  |  |  |
| `/Webservers/Resource/PicSet` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Resource/PicUpdateSet` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Room/GetExecRecord` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/Room/GetLuckNumberRecord` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/RoomTeam/GetMemberInfo` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/RoomTeam/GetRoomTeamWeekRankData` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/RoomTeam/GetTaskInfo` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/RoomTeam/GetUserRankData` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Shop/GetInRoomEffectsList` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/Shop/GetProfileCardList` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/Shop/PersonalVehicleList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Shop/SetTopBid` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Shop/SetTopList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Shop/SetTopPurchase` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Shop/ShopPurchase` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Shop/ShopPurchaseTheme` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Shop/ShopRoomThemeList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Shop/ShopRoomThemeListByType` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Shop/ShopRoomThemeListTop` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Shop/ShopSkillCardList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Shop/ShopUnitPrice` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Shop/ShopUse` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/Shop/ShopUserbuy` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Shop/ShopVehicle` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Shop/ShopVehicleList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Task/CheckInAddupWeek` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Task/SignIn` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Task/SignInWhether` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Task/TaskGetCoin` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/Task/TaskList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/ActivateAccount` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/AndroidTokenAdd` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/CancelAccount` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/CancelAccountCheck` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/CancelConfirmation` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/ChangeKAVIPShowState` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/ChangeKAVIPStealthVisit?` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/ChangePremiumFirstState` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/CheckPhoneRegister` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/CloseMark` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/CloseReportLogs` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/DeleteUserTrustDevice` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/FbLogin` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/FeedbackAdd` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/GetAvatarList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/GetCancelReason` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/GetFirstRechargeInfo` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/GetLogOutFBPopConfig` |  |  |  |  |  | ✓ |
| `/Webservers/User/GetPhoneCodeSendType` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/GetUserBlack` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/User/GetUserReturnInfo` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/HeInformation` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/HeadFrameList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/InstagramLogin` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/KAVIPExperienceDetails` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/KAVIPPrivilege` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/LoginOut` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/PhoneChange` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/PhoneSaleLogin` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/PlatformIntoLogIns` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/PostAddTrustDevice` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/PropUserHonor` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/RegisEventIns` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/ReportSafetyData` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/User/SendPhoneCode` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/SetUserKAVIPLvPopUpFlag` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/SwitchUserDevice` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/TagList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/TwitterLogin` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UrlConfigList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserBindingAccount` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserBindingCheck` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserDevcieRegister` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserInBar` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserInformation` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserInformationEdit` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserKAVIPInfo` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserNotificationSlt` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserNotificationUp` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserPasswordEdit` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserPrivacySlt` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserPrivacyupt` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserServiceInfo` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserServiceUp` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserSmRegister` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserSmRetrievePwd` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserTrustDeviceList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserUnBindingAccount` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserUnblockAppeal` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserVehicleEdit` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/UserWearHeadframe` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/Userlogin` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/VerCode` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/VerifyThirdAccount` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/VipPrivilege` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/User/WeChatLogin` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/apk/AdvertiUserLogIns` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/bar/GetUserTask` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/bar/RedPaperGetCheck` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/bar/RedPaperGetlist` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/bar/SingleBarSearch` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/bar/barsearch` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/cdkey/Exchange` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/cdkey/List` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/chat/BindChatCreateGroup` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/chat/BindChatFriendChat` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/chat/BindChatJoinGroup` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/chat/CreateGroup` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/chat/FriendChat` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/chat/JoinGroup` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/chat/circleGroupInfo` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/events/point` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/geet/getCdkInfo` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/giftBlindBox/giftBlindBoxRecordList` |  | ✓ | ✓ |  |  |  |
| `/Webservers/rankinglist/RankingList` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/Webservers/task/bindthirdtip` |  |  |  |  | ✓ | ✓ |
| `/Webservers/user/UserWealthLvInfo` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/video/gethot` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/video/getinroom` |  |  |  | ✓ | ✓ | ✓ |
| `/Webservers/vote/GetVoteActivityHistory` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/api/ApmApi` |  | ✓ | ✓ |  |  |  |
| `/api/BillingClient` |  | ✓ | ✓ |  |  |  |
| `/api/OooOOO0` |  | ✓ | ✓ |  |  |  |
| `/api/Oooo000` |  | ✓ | ✓ |  |  |  |
| `/api/PermissionCallback` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/api/ProductDetails` |  |  |  | ✓ | ✓ | ✓ |
| `/api/Purchase` |  | ✓ | ✓ |  |  |  |
| `/api/SkuDetails` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/api/ZXID` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/api/ZXIDListener` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/api/annotations` |  |  |  | ✓ | ✓ | ✓ |
| `/api/annotations.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/auth.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/backend.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/billing.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/call/NetPlatform$Platform` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/api/call/NewApiClient$CommonRequest$call$2` |  | ✓ | ✓ |  |  |  |
| `/api/call/NewApiClient$CommonRequest$callByOldModel$2` |  | ✓ | ✓ |  |  |  |
| `/api/call/ResponseBodyParseUtils` |  |  |  | ✓ | ✓ | ✓ |
| `/api/call/ResponseBodyParseUtils$parseByApiResult$1$1` |  |  |  | ✓ | ✓ | ✓ |
| `/api/call/ResponseBodyParseUtils$parseByApiResult$type$1` |  |  |  | ✓ | ✓ | ✓ |
| `/api/call/ResponseBodyParseUtils$parseByJustModel$type$1` |  |  |  | ✓ | ✓ | ✓ |
| `/api/call/YLApi$CommonRequest` |  |  |  | ✓ | ✓ | ✓ |
| `/api/call/YLApi$CommonRequest$call$2` |  |  |  | ✓ | ✓ | ✓ |
| `/api/call/YLApi$CommonRequest$callString$2` |  |  |  | ✓ | ✓ | ✓ |
| `/api/call/core/HttpCoreRequest` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/api/call/core/IHttpService` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/api/call/request/GetRequest` |  |  |  | ✓ | ✓ | ✓ |
| `/api/call/request/ParamsWrapper` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/api/client.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/common/Attributes` |  |  |  |  | ✓ | ✓ |
| `/api/config_change.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/configchange` |  |  |  | ✓ | ✓ | ✓ |
| `/api/consumer.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/context.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/control.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/crashsdk/logcollect` |  | ✓ | ✓ |  |  |  |
| `/api/crashsdk/validate` |  | ✓ | ✓ |  |  |  |
| `/api/distribution` |  |  |  | ✓ | ✓ | ✓ |
| `/api/distribution.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/documentation.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/endpoint.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/error_reason` |  |  |  | ✓ | ✓ | ✓ |
| `/api/error_reason.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/field_behavior.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/http.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/httpbody` |  |  |  | ✓ | ✓ | ✓ |
| `/api/httpbody.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/label` |  |  |  | ✓ | ✓ | ✓ |
| `/api/label.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/launch_stage.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/log.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/logging.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/metric` |  |  |  | ✓ | ✓ | ✓ |
| `/api/metric.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/metrics/LongCounter` |  |  |  | ✓ | ✓ | ✓ |
| `/api/metrics/MeterBuilder` |  |  |  | ✓ | ✓ | ✓ |
| `/api/monitored_resource.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/monitoredres` |  |  |  | ✓ | ✓ | ✓ |
| `/api/monitoring.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/old/ApiClient` |  |  |  | ✓ | ✓ | ✓ |
| `/api/old/service/LogApiService` |  |  |  | ✓ | ✓ | ✓ |
| `/api/old/service/MainApiService` |  |  |  | ✓ | ✓ | ✓ |
| `/api/old/service/RoomApiService` |  |  |  | ✓ | ✓ | ✓ |
| `/api/old/service/SearchApiService` |  |  |  | ✓ | ✓ | ✓ |
| `/api/old/service/TaskService` |  |  |  | ✓ | ✓ | ✓ |
| `/api/old/service/WalletService` |  |  |  | ✓ | ✓ | ✓ |
| `/api/old/service/YallaChatApiService` |  |  |  | ✓ | ✓ | ✓ |
| `/api/old/service/YallaChatBindApiService` |  |  |  | ✓ | ✓ | ✓ |
| `/api/old/service/YallaTeamApiService` |  |  |  | ✓ | ✓ | ✓ |
| `/api/postZdata` |  | ✓ | ✓ |  |  |  |
| `/api/quota.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/resource.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/routing.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/service.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/service/EventApiService` |  | ✓ | ✓ |  |  |  |
| `/api/service/GiftBlindBoxService` |  | ✓ | ✓ |  |  |  |
| `/api/service/LogApiService` |  | ✓ | ✓ |  |  |  |
| `/api/service/MainApiService` |  | ✓ | ✓ |  |  |  |
| `/api/service/MomentApiService` |  | ✓ | ✓ |  |  |  |
| `/api/service/RoomApiService` |  | ✓ | ✓ |  |  |  |
| `/api/service/SearchApiService` |  | ✓ | ✓ |  |  |  |
| `/api/service/TaskService` |  | ✓ | ✓ |  |  |  |
| `/api/service/TopicApiService` |  | ✓ | ✓ |  |  |  |
| `/api/service/UserInfoService` |  | ✓ | ✓ |  |  |  |
| `/api/service/UserMomentService` |  | ✓ | ✓ |  |  |  |
| `/api/service/VipService` |  | ✓ | ✓ |  |  |  |
| `/api/service/VoteApiService` |  | ✓ | ✓ |  |  |  |
| `/api/service/WalletService` |  | ✓ | ✓ |  |  |  |
| `/api/service/YallaChatApiService` |  | ✓ | ✓ |  |  |  |
| `/api/service/YallaChatBindApiService` |  | ✓ | ✓ |  |  |  |
| `/api/service/YallaTeamApiService` |  | ✓ | ✓ |  |  |  |
| `/api/serviceconfig` |  |  |  | ✓ | ✓ | ✓ |
| `/api/source_info.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/system_parameter.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/trace/Span` |  |  |  | ✓ | ✓ | ✓ |
| `/api/trace/SpanBuilder` |  |  |  | ✓ | ✓ | ✓ |
| `/api/trace/StatusCode` |  |  |  | ✓ | ✓ | ✓ |
| `/api/trace/Tracer` |  |  |  | ✓ | ✓ | ✓ |
| `/api/trace/TracerBuilder` |  |  |  | ✓ | ✓ | ✓ |
| `/api/updateZdata` |  | ✓ | ✓ |  |  |  |
| `/api/usage.proto` |  |  |  | ✓ | ✓ | ✓ |
| `/api/v1/android/validate_subscription` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/api/v1/client_report` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `/api/v1/mix/upload` |  | ✓ | ✓ |  |  |  |
| `/api/v1/raw/upload` |  | ✓ | ✓ |  |  |  |
| `/api/visibility` |  |  |  | ✓ | ✓ | ✓ |
| `/api/visibility.proto` |  |  |  | ✓ | ✓ | ✓ |

## Server-delivered activity/theme/event fields

| Field | 2.17.0 | 2.18.0 | 2.18.1 | 2.23.0 | 2.23.1 | 2.23.2 |
|---|---|---|---|---|---|---|
| `activityId` |  |  |  | ✓ | ✓ | ✓ |
| `activityImage` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `activityMsg` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `activityText1` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `activityText2` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `activityUrl` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `campaignId` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `eventEndTime` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `eventId` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `eventImageUrl` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `eventName` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `eventRoomId` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `eventStartTime` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `h5EntranceUrl` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `jumpUrl` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `redirectUrl` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `roomTheme` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `roomThemeUrl` |  |  |  |  |  |  |
| `shareUrl` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `themeBgImgUrl` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `themeBgName` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `themeDayLimit` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `themeExpireTime` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `themeGiveId` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `themeName` |  | ✓ | ✓ | ✓ | ✓ | ✓ |
| `themeVideoUrl` |  | ✓ | ✓ | ✓ | ✓ | ✓ |

## Extracted Yalla URLs

- `https://api.open.yalla.chat` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://apiv2.yalla.live` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://chatmsg.yalla.live:443` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://clog.yalla.live` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://dev-sailfish.yallalive.cn` · 2.23.0, 2.23.1, 2.23.2
- `https://event.yalla.live` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://fat-sailfish.yallalive.cn` · 2.23.0, 2.23.1, 2.23.2
- `https://file.yalla.live` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://file.yalla.live/ErrorCode/errorcode.json` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://file.yalla.live/Medal/New_v1_L/Medal_` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://file.yalla.live/Medal/New_v1_S/Medal_` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://file.yalla.live/test/speedtest.rar` · 2.18.0, 2.18.1
- `https://files.yalla.chat/download/apk` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://logcenter.yalla.live` · 2.18.0, 2.18.1
- `https://moment.yalla.live` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://payv2.yalla.live` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://play.google.com/store/apps/details?id%3Dcom.yallatech.yallachat#Intent` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://roomapi.yalla.live` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://sailfish.yalla.live` · 2.23.0, 2.23.1, 2.23.2
- `https://search.yalla.live` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://shop.yalla.live` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://www.yalla.chat` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://www.yalla.live/` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live` · 2.18.0, 2.18.1, 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live/19145269/MoMent/1uBT7jPk1D/` · 2.18.0, 2.18.1
- `https://yallatestfile.yalla.live/19145269/MoMent/1uBT7jPk1D/0.jpeg` · 2.18.0, 2.18.1
- `https://yallatestfile.yalla.live/CustomProp/Skin/0_1.svga` · 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0422111950545.mp4` · 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0506171924794.mp4` · 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0520113320895.mp4` · 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0520113731041.mp4` · 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0609145213312.mp4` · 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627105500997.mp4` · 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627105602865.mp4` · 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627105708965.mp4` · 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627105807152.mp4` · 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627105859972.mp4` · 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627110832921.mp4` · 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627111256118.mp4` · 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live/dynamiceeffectprop/2022/0627111315333.mp4` · 2.23.0, 2.23.1, 2.23.2
- `https://yallatestfile.yalla.live/testVideo/yyevaTestVideo.mp4` · 2.23.0, 2.23.1, 2.23.2