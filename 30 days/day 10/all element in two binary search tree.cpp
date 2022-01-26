class Solution
{
public:
     vector<int> getAllElements(TreeNode *root1, TreeNode *root2)
     {
          vector<int> res;
          stack<TreeNode *> s1, s2;
      <span class="hljs-keyword" style="box-sizing: border-box; color: rgb(170, 13, 145);">while</span> (root1 || root2 || !s1.<span class="hljs-keyword" style="box-sizing: border-box; color: rgb(170, 13, 145);">empty</span>() || !s2.<span class="hljs-keyword" style="box-sizing: border-box; color: rgb(170, 13, 145);">empty</span>())
      {
           <span class="hljs-keyword" style="box-sizing: border-box; color: rgb(170, 13, 145);">while</span> (root1 != <span class="hljs-literal" style="box-sizing: border-box; color: rgb(170, 13, 145);">NULL</span>)
           {
                s1.push(root1);
                root1 = root1-&gt;left;
           }
           <span class="hljs-keyword" style="box-sizing: border-box; color: rgb(170, 13, 145);">while</span> (root2 != <span class="hljs-literal" style="box-sizing: border-box; color: rgb(170, 13, 145);">NULL</span>)
           {
                s2.push(root2);
                root2 = root2-&gt;left;
           }
           <span class="hljs-keyword" style="box-sizing: border-box; color: rgb(170, 13, 145);">if</span> (s2.<span class="hljs-keyword" style="box-sizing: border-box; color: rgb(170, 13, 145);">empty</span>() || (!s1.<span class="hljs-keyword" style="box-sizing: border-box; color: rgb(170, 13, 145);">empty</span>() &amp;&amp; s1.top()-&gt;val &lt;= s2.top()-&gt;val))
           {
                root1 = s1.top();
                s1.pop();
                res.push_back(root1-&gt;val);
                root1 = root1-&gt;right;
           }
           <span class="hljs-keyword" style="box-sizing: border-box; color: rgb(170, 13, 145);">else</span>
           {
                root2 = s2.top();
                s2.pop();
                res.push_back(root2-&gt;val);
                root2 = root2-&gt;right;
           }
      }
      <span class="hljs-keyword" style="box-sizing: border-box; color: rgb(170, 13, 145);">return</span> res;
 }
