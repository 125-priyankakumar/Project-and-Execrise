import React from "react";
import {
  FaRegCheckCircle,
  FaComment,
  FaRegChartBar,
  FaHeart,
  FaLeaf,
} from "react-icons/fa";
const Posts = () => {
  return (
    <div className="postss">
      <div className="postss__first">
        <div className="posts__first__img">
          <img src="/images/profile.jfif" alt="profile img" />
        </div>
        <div className="posts__first__name">
          <strong>Priyanka Kumar</strong> <FaRegCheckCircle className="verify" />
        </div>
        <div className="posts__first__username">
          @priyakumar22 <span>6m</span>
        </div>
      </div>
      <div className="postss__details">
        <div className="postss__details__msg">
         Being  trader I'm so happy to see such bull games(jallikattu) and definitely market will also perform like this bulls #Jallikattu
        </div>
        <div className="postss__details__img">
          <img src="/images/post.jpg" alt="post" />
        </div>
        <div className="reactions">
          <span>
            <FaComment className="re" /> 65
          </span>
          <span>
            <FaRegChartBar className="re" /> 4
          </span>
          <span>
            <FaHeart className="re" /> 345
          </span>
          <span>
            <FaLeaf className="re" /> 234
          </span>
        </div>
      </div>
    </div>
  );
};

export default Posts;
