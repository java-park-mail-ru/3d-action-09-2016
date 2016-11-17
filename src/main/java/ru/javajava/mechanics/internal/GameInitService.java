package ru.javajava.mechanics.internal;

import org.springframework.stereotype.Service;

/**
 * Created by ivan on 15.11.16.
 */
@Service    // предположительно не нужен
public class GameInitService {
//    private static final Logger LOGGER = LoggerFactory.getLogger(GameInitService.class);
//
//    private final RemotePointService remotePointService;
//    private final ObjectMapper objectMapper = new ObjectMapper();
//
//    public GameInitService(RemotePointService remotePointService) {
//        this.remotePointService = remotePointService;
//    }
//
//    public void initGameFor(GameSession gameSession) {
//        gameSession.getFirst().getSquare().claimPart(PositionPart.class).setBody(new Coords(0.0f, 0.0f));
//        gameSession.getSecond().getSquare().claimPart(PositionPart.class).setBody(
//                new Coords(Config.PLAYGROUND_WIDTH - Config.SQUARE_SIZE,
//                        Config.PLAYGROUND_HEIGHT - Config.SQUARE_SIZE)
//        );
//        final Collection<GameUser> players = new ArrayList<>();
//        players.add(gameSession.getFirst());
//        players.add(gameSession.getSecond());
//        for (GameUser player : players) {
//            final InitGame.Request initMessage = createInitMessageFor(gameSession, player.getId());
//            //noinspection OverlyBroadCatchBlock
//            try {
//                final Message message = new Message(InitGame.Request.class.getName(),
//                        objectMapper.writeValueAsString(initMessage));
//                remotePointService.sendMessageToUser(player.getId(), message);
//            } catch (IOException e) {
//                //TODO: Reentrance mechanism
//                players.forEach(playerToCutOff -> remotePointService.cutDownConnection(playerToCutOff.getId(),
//                        CloseStatus.SERVER_ERROR));
//                LOGGER.error("Unable to start a game", e);
//            }
//        }
//    }
//
//    @SuppressWarnings("TooBroadScope")
//    private InitGame.Request createInitMessageFor(@NotNull GameSession gameSession, @NotNull Id<UserProfile> userId) {
//        final GameUser self = gameSession.getSelf(userId);
//        final InitGame.Request initGameMessage = new InitGame.Request();
//
//        final List<ServerPlayerSnap> playerSnaps = new ArrayList<>();
//        final Map<Id<UserProfile>, String> names = new HashMap<>();
//        final Map<Id<UserProfile>, String> colors = new HashMap<>();
//        final Map<Id<UserProfile>, String> gunColors = new HashMap<>();
//
//        colors.put(userId, Config.SELF_COLOR);
//        gunColors.put(userId, Config.SELF_GUN_COLOR);
//        colors.put(gameSession.getEnemy(self).getId(), Config.ENEMY_COLOR);
//        gunColors.put(gameSession.getEnemy(self).getId(), Config.ENEMY_GUN_COLOR);
//
//        final Collection<GameUser> players = new ArrayList<>();
//        players.add(gameSession.getFirst());
//        players.add(gameSession.getSecond());
//        for (GameUser player : players) {
//            playerSnaps.add(player.generateSnap());
//            names.put(player.getId(), player.getUserProfile().getLogin());
//        }
//
//        initGameMessage.setSelf(userId);
//        initGameMessage.setSelfSquareId(gameSession.getSelf(userId).getSquare().getId());
//        initGameMessage.setColors(colors);
//        initGameMessage.setGunColors(gunColors);
//        initGameMessage.setNames(names);
//        initGameMessage.setPlayers(playerSnaps);
//        return initGameMessage;
//    }
}
